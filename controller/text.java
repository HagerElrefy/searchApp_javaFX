/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Hager Ahmed
 */
public class text implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
     @FXML
    private TextArea TXT_erea2;
    @FXML
    private TextArea TXT_erea;
    @FXML
    private AnchorPane test;

    @FXML
    private TextField grade;

    @FXML
    void text_ac(ActionEvent event) throws SQLException {

    }
 
    @FXML
    void action(ActionEvent event) {

        try {
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "");
            Statement statement = con.createStatement();
            String sql = "select * from student where Grade=" + grade.getText() + " and GPA = (select MAX(GPA) from student where Grade = " + grade.getText() + ")";
            ResultSet rs;
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                JOptionPane.showMessageDialog(null, rs.getString("Name"));
                JOptionPane.showMessageDialog(null, rs.getDouble("GPA"));
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(logInController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    void Back_Action(ActionEvent event) throws IOException {
        test.getScene().getWindow().hide();
        Stage login = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/frontEnd/Home.fxml"));

        Scene scene = new Scene(root, 330, 370);
        login.setScene(scene);
        login.setResizable(false);
        login.show();
    }
}
