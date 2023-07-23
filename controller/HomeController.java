/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Hager Ahmed
 */
public class HomeController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    private AnchorPane Home;

    @FXML
    void logOutAction(ActionEvent event) throws IOException {
        Home.getScene().getWindow().hide();
        Stage login = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/frontEnd/LogIn.fxml"));

        Scene scene = new Scene(root, 400, 370);
        login.setScene(scene);
        login.setResizable(false);
        login.show();
    }

    @FXML
    void GPA_Action(ActionEvent event) throws IOException {
        Home.getScene().getWindow().hide();
        Stage login = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/testg/FXML.fxml"));
        Scene scene = new Scene(root);
        login.setScene(scene);
        login.setResizable(false);
        login.show();
    }

    @FXML
    void Registration_Action(ActionEvent event) throws IOException {
        Home.getScene().getWindow().hide();
        Stage login = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/frontEnd/Register.fxml"));
        Scene scene = new Scene(root);
        login.setScene(scene);
        login.setResizable(false);
        login.show();
    }

    @FXML
    void Rebort_Action(ActionEvent event) throws IOException {
        Home.getScene().getWindow().hide();
        Stage login = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/frontEnd/FXML.fxml"));
        Scene scene = new Scene(root, 600, 500);
        login.setScene(scene);
        login.setResizable(false);
        login.show();
    }

}
