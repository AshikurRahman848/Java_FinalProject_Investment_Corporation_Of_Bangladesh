/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icb;

import ModelClass.Chairman;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Chairman_UpdateDSEController implements Initializable {

    @FXML
    private Button backBtn;
    @FXML
    private TextField authorosedTextfield;
    @FXML
    private TextField teamUptxtField;
    @FXML
    private TextField faceTextField;
    @FXML
    private TextField OStxtfield;
    @FXML
    private Label msgLAbel;
    @FXML
    private TextField shareIDTV;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backBtnOnClick(ActionEvent event) throws IOException {
        
             Parent root = FXMLLoader.load(getClass().getResource("Chairman_Profile.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        //Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void addBtnOnClick(ActionEvent event) throws IOException {
        
       String a = authorosedTextfield.getText();
                   String b =  teamUptxtField.getText();
                    String face =  faceTextField.getText();
                     String os =  OStxtfield.getText();
                
                     
                     Chairman.updateDSE(a, b, face, os,shareIDTV.getText());
                     msgLAbel.setText("Information is saved");
    }
    
}
