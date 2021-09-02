package travelApplication;

import java.util.Random;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Ticket implements Initializable {

    // Initialize Data-Fields
    @FXML
    private Button closeButton;

    @FXML
    private Label userName;

    @FXML
    private Label ticket;

    @FXML
    private AnchorPane rootpane;

    // Generage random number for ticket
    public void setName1(String username){

        Random rand = new Random();

        userName.setText(username);
        ticket.setText(Integer.toString( rand.nextInt(50) + 1));
    }

    public void exitButton() throws IOException {

        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Empty
    }
}
