/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icb;

import ModelClass.CSE;
import ModelClass.General_Manager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class GM_ViewDSEController implements Initializable {

    @FXML
    private TableView<CSE> DSEtable;
    @FXML
    private TableColumn<CSE, String> acCol;
    @FXML
    private TableColumn<CSE, String> TCcol;
    @FXML
    private TableColumn<CSE, String> faceCol;
    @FXML
    private TableColumn<CSE, String> OScol;
    @FXML
    private Button backBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        acCol.setCellValueFactory(new PropertyValueFactory<CSE, String>("v1"));
       TCcol.setCellValueFactory(new PropertyValueFactory<CSE, String>("v2"));
       faceCol.setCellValueFactory(new PropertyValueFactory<CSE, String>("v3"));
        OScol.setCellValueFactory(new PropertyValueFactory<CSE, String>("v4"));
     
        try {
            General_Manager.viewDSE(DSEtable);
            // TODO
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Chairman_ViewEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO
    }    

    @FXML
    private void backBtnOnClick(ActionEvent event)  throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("GM_rofile.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        //Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    
}
