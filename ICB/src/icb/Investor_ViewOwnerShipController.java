/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icb;

import ModelClass.CSE;
import ModelClass.General_Manager;
import ModelClass.Investor;
import ModelClass.OwnerShip;
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
public class Investor_ViewOwnerShipController implements Initializable {

    @FXML
    private TableView<OwnerShip> ownerShipTable;
    @FXML
    private TableColumn<OwnerShip, String> nameCol;
    @FXML
    private TableColumn<OwnerShip, String> noOfShareCol;
    @FXML
    private TableColumn<OwnerShip, String> percentageCol;
    @FXML
    private Button backBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameCol.setCellValueFactory(new PropertyValueFactory<OwnerShip, String>("name"));
       noOfShareCol.setCellValueFactory(new PropertyValueFactory<OwnerShip, String>("noOfshare"));
       percentageCol.setCellValueFactory(new PropertyValueFactory<OwnerShip, String>("percentage"));
        
     
        try {
            Investor.viewOwnerShip(ownerShipTable);
            // TODO
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Chairman_ViewEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO
    }    

    @FXML
    private void backBtnOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Investor_Profile.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        //Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    
}
