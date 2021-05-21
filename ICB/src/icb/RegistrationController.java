/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icb;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class RegistrationController implements Initializable {

    @FXML
    private TextField useridTextfield;
    @FXML
    private TextField PasswordTextfield;
    @FXML
    private Button registrationBtn;
    @FXML
    private Button backBtn;
    @FXML
    private Label showMessageLabel;
    @FXML
    private ComboBox userTypeComboBox;
    @FXML
    private Button loginBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         userTypeComboBox.getItems().addAll("Chairman","MD","GM","AssistantManager","Investor");
        userTypeComboBox.setValue("MD"); 
        // TODO
    }    

    @FXML
    private void registrationBtnOnAction(ActionEvent event) {
        
        File f = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("Registration.bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);
            
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(bos);
            //dos = new DataOutputStream(fos);
            
            dos.writeInt(Integer.parseInt(useridTextfield.getText()));
            dos.writeUTF(PasswordTextfield.getText());
            dos.writeUTF(userTypeComboBox.getValue().toString());
            
            showMessageLabel.setText("Registration Successfull!");
            
           
            

        } catch (IOException ex) {
           
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                
            }
        }      
    }

    @FXML
    private void backBtnOnClick(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        //Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void loginBtnOnClick(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        //Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    
}
