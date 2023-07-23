/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class logInController implements Initializable {

    @FXML
    private Text message;
    @FXML
    private Text message1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        message.setVisible(false);
        message1.setVisible(false);
    }
    @FXML
    private AnchorPane Login;

    @FXML
    private TextField ID;

    @FXML
    private TextField userName;

    @FXML
    void logInACtion(ActionEvent event) throws IOException {
        if (userName.getText().trim().isEmpty() && ID.getText().trim().isEmpty()) {
            message.setVisible(true);

        } else {
            int id = Integer.parseInt(ID.getText());

            try {
                Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "");
                Statement statement = con.createStatement();
                String sql = "select * from student where Name='" + userName.getText() + "' and ID =" + ID.getText();
                ResultSet rs;
                rs = statement.executeQuery(sql);
                if (rs.next()) {
                    Login.getScene().getWindow().hide();
                    Stage home = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("/frontEnd/Home.fxml"));
                    Scene scene = new Scene(root, 330, 370);
                    home.setScene(scene);
                    home.setResizable(false);
                    home.show();

                } else {
                    message1.setVisible(true);

                }
            } catch (SQLException ex) {
                Logger.getLogger(logInController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
