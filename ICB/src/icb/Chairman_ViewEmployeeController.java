/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icb;

import ModelClass.Chairman;
import ModelClass.Employee;
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
public class Chairman_ViewEmployeeController implements Initializable {

    @FXML
    private TableView<Employee> empTable;
    @FXML
    private TableColumn<Employee, String> nameCol;
    @FXML
    private TableColumn<Employee, String> posCol;
    @FXML
    private TableColumn<Employee, String> lastDegreeCol;
    @FXML
    private Button backBtn;
    
 

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        nameCol.setCellValueFactory(new PropertyValueFactory<Employee, String>("Name"));
       posCol.setCellValueFactory(new PropertyValueFactory<Employee, String>("Position"));
       lastDegreeCol.setCellValueFactory(new PropertyValueFactory<Employee, String>("degree"));
     
        try {
            Chairman.viewEmployee(empTable);
            // TODO
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Chairman_ViewEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
}
