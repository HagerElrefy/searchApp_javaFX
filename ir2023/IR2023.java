package ir2023;

//import com.example.algorithms.InvertedIndex;
import ir2023.IR2023Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
import javafx.scene.Parent;

public class IR2023 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
 FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/frontEnd/ir-layout.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 600);
        stage.setTitle("!Google");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}