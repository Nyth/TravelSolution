package travelApplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    // Create new Stage
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/main.fxml"));
        primaryStage.setTitle("Travel Solutions");
        primaryStage.setScene(new Scene(root, 650, 430));
        primaryStage.show();
        primaryStage.setResizable(false);
    }

    // Launch Program
    public static void main(String[] args) {
        launch(args);
    }
}
