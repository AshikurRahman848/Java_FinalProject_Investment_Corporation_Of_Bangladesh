/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icb;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
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
public class LogInController implements Initializable {

    @FXML
    private TextField useridTextfield;
    @FXML
    private TextField PasswordTextfield;
    @FXML
    private Button logInBtn;
    @FXML
    private Button backBtn;
    @FXML
    private Label showMessageLabel;
    @FXML
    private ComboBox userTypeComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        userTypeComboBox.getItems().addAll("Chairman","MD","GM","AssistantManager","Investor");
        userTypeComboBox.setValue("MD"); 
        // TODO
    }

public void loadprofile(String type, ActionEvent event) throws IOException
    {
          if(type.equals("Chairman"))
        {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("Chairman_Profile.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
        }
        else if(type.equals("MD"))
        {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("MD_Profile.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
            
        }
          else if(type.equals("GM"))
        {
              Parent scene2Parent = FXMLLoader.load(getClass().getResource("GM_profile.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
            
        }
          else if(type.equals("AssistantManager"))
        {
              Parent scene2Parent = FXMLLoader.load(getClass().getResource("AM_profile.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
            
        }
          else if(type.equals("Investor"));
        {
              Parent scene2Parent = FXMLLoader.load(getClass().getResource("Investor_Profile.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
            
        }
     
     
      
    }    

    @FXML
    private void logInBtnOnClick(ActionEvent event) {
        
         File f = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        String str="";
        try {
            f = new File("Registration.bin");
            if(!f.exists()){
                showMessageLabel.setText("file does not exist...");
            }
            else{
                
                fis = new FileInputStream(f);
                //bis = new BufferedInputStream(fis);
                //dis = new DataInputStream(bis);
                dis = new DataInputStream(fis);
                //String str="";
                
                int id = Integer.parseInt(useridTextfield.getText());
                String pass = PasswordTextfield.getText();
                String type = userTypeComboBox.getValue().toString();
                
                while(true){
                  
                    if(id== dis.readInt())
                    {
                        if(pass.equals(dis.readUTF()))
                        {
                            if(type.equals(dis.readUTF()))
                            {
                                 loadprofile(userTypeComboBox.getValue().toString(),event);
                                break;
                            }
                        }
                    }
                    
                    
                    
                    //outputTextArea.setText(str);
                }
                
            }
        } catch (IOException ex) {
            showMessageLabel.setText(str);
            
        } finally {
            try {
                if(dis != null) dis.close();
            } catch (IOException ex) {
               
            }
        }
    

    }

    @FXML
    private void backBtnOnClick(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Registration.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        //Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    
}
