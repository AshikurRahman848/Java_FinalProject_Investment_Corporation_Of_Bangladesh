/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icb;

import ModelClass.CSE;
import ModelClass.General_Manager;
import ModelClass.Investor;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Investor_ViewCSEController implements Initializable {
    
    
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
            Investor.viewCSE(DSEtable);
            // TODO
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Chairman_ViewEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO
    }    
    
}
