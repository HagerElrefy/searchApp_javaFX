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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Hager Ahmed
 * 
 */
public class RegisterController implements Initializable {

    @FXML
    private AnchorPane Choose_Dep;
    @FXML
    private TextField Grade;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
   

    @FXML
    void CS_Action(ActionEvent event) throws IOException {
        int parse = Integer.parseInt(Grade.getText());
        if(parse > 66){
        
        Choose_Dep.getScene().getWindow().hide();
        Stage login = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/frontend1/CS.fxml"));
        Scene scene = new Scene(root);
        login.setScene(scene);
        login.setResizable(false);
        login.show();
        
        
        }
         else{
        
            JOptionPane.showMessageDialog(null, "not allowed");
        }
        

    }

    @FXML
    void IT_Action(ActionEvent event) throws IOException {
        int parse = Integer.parseInt(Grade.getText());
        if(parse > 66){ 
        
        Choose_Dep.getScene().getWindow().hide();
        Stage login = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/It/it_FXML.fxml"));
        Scene scene = new Scene(root);
        login.setScene(scene);
        login.setResizable(false);
        login.show();
        
        
        
        }
         else{
        
            JOptionPane.showMessageDialog(null, "not allowed");
        }
       
    }

    @FXML
    void IS_Action(ActionEvent event) throws IOException {
        int parse = Integer.parseInt(Grade.getText());
        if(parse > 66){
        Choose_Dep.getScene().getWindow().hide();
        Stage login = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/ISTest/is_page.fxml"));
        Scene scene = new Scene(root);
        login.setScene(scene);
        login.setResizable(false);
        login.show();
        }
         else{
        
            JOptionPane.showMessageDialog(null, "not allowed");
        }
        
    }

    @FXML
    void back_Action(ActionEvent event) throws IOException {
        Choose_Dep.getScene().getWindow().hide();
        Stage login = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/frontEnd/Home.fxml"));
        Scene scene = new Scene(root);
        login.setScene(scene);
        login.setResizable(false);
        login.show();
    }

    @FXML
    void Less66_Action(ActionEvent event) throws IOException {
         int parse = Integer.parseInt(Grade.getText());
        if(parse < 67){
        
         Choose_Dep.getScene().getWindow().hide();
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/level_one_fxml/level_one_1.fxml"));
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        
        }
        else{
        
            JOptionPane.showMessageDialog(null, "not allowed");
        }
       
    }

    @FXML
    void grade_Action(ActionEvent event) {
       
    }

}
