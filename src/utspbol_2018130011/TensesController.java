/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package utspbol_2018130011;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tasya
 */
public class TensesController implements Initializable {
    @FXML
    private TableView<TenseModel> tbtense;
    
    public static DBTense dttense=new DBTense();

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private void backButton(ActionEvent event) throws IOException {
        
        showStage(event,"Materials.fxml");
        
    }
    private void showStage(ActionEvent event, String fxmlResource) throws IOException {
    Node source = (Node) event.getSource();

    Stage stage = (Stage) source.getScene().getWindow();
    Parent root = FXMLLoader.load(getClass().getResource(fxmlResource));

    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showdata();
     
    }    
    
    public void showdata(){
        ObservableList<TenseModel> data=TensesController.dttense.Load();
        
        
        if(data!=null){            
            tbtense.getColumns().clear();            
            tbtense.getItems().clear();
            TableColumn col=new TableColumn("tense_ID");
            col.setCellValueFactory(new PropertyValueFactory<TenseModel, String>("tense_ID"));
            tbtense.getColumns().addAll(col);
            col=new TableColumn("type");
            col.setCellValueFactory(new PropertyValueFactory<TenseModel, String>("type"));
            tbtense.getColumns().addAll(col);
            col=new TableColumn("description");
            col.setCellValueFactory(new PropertyValueFactory<TenseModel, String>("description"));
            tbtense.getColumns().addAll(col);
            col=new TableColumn("examples");
            col.setCellValueFactory(new PropertyValueFactory<TenseModel, String>("examples"));
            tbtense.getColumns().addAll(col);
            
           
           tbtense.setItems(data);
    }else {  Alert a=new Alert(Alert.AlertType.ERROR,"Data kosong",ButtonType.OK);
            a.showAndWait();
            tbtense.getScene().getWindow().hide();
        }                
    }
    
}
