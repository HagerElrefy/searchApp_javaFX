package ir2023;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.Parent;

public class IR2023Controller {
    @FXML
    private AnchorPane welcomePage;
    
    @FXML
    void onGettingStartedClicked(ActionEvent event) throws IOException {

        welcomePage.getScene().getWindow().hide();
        Stage homeStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/frontEnd/home-layout.fxml"));
        Scene scene = new Scene(root, 1000, 600);
        homeStage.setTitle("!Google");
        homeStage.setScene(scene);
        homeStage.setResizable(false);
        homeStage.show();
    }
}