package travelApplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {

    // Initialize Data-Fields
    @FXML
    private AnchorPane rootpane;
    @FXML
    private Label labelStatus;

    @FXML
    private TextField LoginUser;

    @FXML
    private TextField LoginPass;

    public void Login(ActionEvent event) throws Exception{

        Stage primaryStage = new Stage();
        /*FXMLLoader Loader = new FXMLLoader(getClass().getResource("/fxml/searchFlight.fxml"));
        AnchorPane pane = Loader.load();
        rootpane.getChildren().setAll(pane);
        */
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/searchFlight.fxml"));
        primaryStage.setTitle("Travel Solutions");
        primaryStage.setScene(new Scene(root, 630, 410));
        primaryStage.show();
        primaryStage.setResizable(false);
    }
}
