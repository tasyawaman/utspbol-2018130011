/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package utspbol_2018130011;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tasya
 */

public class MaterialsController implements Initializable {
    
    /**
     * Initializes the controller class.
     */
    @FXML
    private void backButton(ActionEvent event) throws IOException {
        
        showStage(event,"Homepage.fxml");
        
    }
    @FXML
    private void tenses(ActionEvent event) throws IOException {
        
        showStage(event,"Tenses.fxml");
        
    }
    @FXML
    private void grammar(ActionEvent event) throws IOException {
        
        showStage(event,"Grammar.fxml");
        
    }
    @FXML
    private void vocabulary(ActionEvent event) throws IOException {
        
        showStage(event,"Vocabulary.fxml");
        
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
        // TODO
    }    
    
}
