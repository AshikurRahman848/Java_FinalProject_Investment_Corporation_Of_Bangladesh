/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icb;

import ModelClass.Chairman;
import ModelClass.General_Manager;
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
public class GM_AppointCounselorController implements Initializable {

    @FXML
    private Button backBtn;
    @FXML
    private TextField nametxtfield;
    @FXML
    private TextField investortxtfield;
    @FXML
    private TextField dateTextField;
    @FXML
    private TextField timetxtfield;
    @FXML
    private Button addBtn;
    @FXML
    private Label msgLAbel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backBtnOnClick(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("GM_rofile.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        //Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void addBtnOnClick(ActionEvent event) throws IOException {
        
         String a = nametxtfield.getText();
                   String b =  investortxtfield.getText();
                    String face =  dateTextField.getText();
                     String os =  timetxtfield.getText();
                
                     
                     General_Manager.updateCousellingSchedule(a, b, face, os);
                     msgLAbel.setText("Information is saved");
    }
    
}
