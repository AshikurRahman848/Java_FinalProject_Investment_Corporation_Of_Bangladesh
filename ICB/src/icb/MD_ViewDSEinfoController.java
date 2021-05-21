/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icb;

import ModelClass.CSE;
import ModelClass.DSE;
import ModelClass.Investor;
import ModelClass.Managing_Director;
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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MD_ViewDSEinfoController implements Initializable {

        @FXML
    private TableView<DSE> DSEtable;
    @FXML
    private TableColumn<DSE, String> acCol;
    @FXML
    private TableColumn<DSE, String> TCcol;
    @FXML
    private TableColumn<DSE, String> faceCol;
    @FXML
    private TableColumn<DSE, String> OScol;
    @FXML
    private Button backBtn;
    @FXML
    private TableColumn<DSE,String> shareIDColumn;
    @FXML
    private Label statusLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         acCol.setCellValueFactory(new PropertyValueFactory<DSE, String>("v1"));
       TCcol.setCellValueFactory(new PropertyValueFactory<DSE, String>("v2"));
       faceCol.setCellValueFactory(new PropertyValueFactory<DSE, String>("v3"));
        OScol.setCellValueFactory(new PropertyValueFactory<DSE, String>("v4"));
        shareIDColumn.setCellValueFactory(new PropertyValueFactory<DSE, String>("v5"));
     
        try {
            Managing_Director.viewDSE(DSEtable,statusLabel);
            // TODO
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Chairman_ViewEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO
    }
    @FXML
    private void backBtnOnClick(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("MD_Profile.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        //Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    
}
