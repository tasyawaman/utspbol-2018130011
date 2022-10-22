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
import javafx.scene.control.Button;
/**
 * FXML Controller class
 *
 * @author tasya
 */


public class HomepageController implements Initializable {
    
    @FXML
    private Button btnMaterials;
    @FXML
    private Button btnAbout;
    @FXML
    private Button btnScore;
    @FXML
    private Button btnQuiz;

    @FXML
    private void MaterialsButton(ActionEvent event) throws IOException {
        
        showStage(event,"Materials.fxml");
        
    }
    
    @FXML
    private void AboutButton(ActionEvent event) throws IOException {
        
        showStage(event,"About.fxml");
        
    }
    @FXML
    private void QuizButton(ActionEvent event) throws IOException {
        
        showStage(event,"Quiz.fxml");
        
    }
    @FXML
    private void ScoreButton(ActionEvent event) throws IOException {
        
        showStage(event,"Score.fxml");
        
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
