package travelApplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UserRegistration {

    // Initialize Data-Fields
    @FXML
    private TextField name;

    @FXML
    private TextField email;

    @FXML
    private TextField contact;

    @FXML
    private TextField address;

    @FXML
    private Label result;

    @FXML
    private RadioButton cash;

    @FXML
    private RadioButton credit;

    @FXML
    private AnchorPane rootpane;

    // Method for Credit Card
    public void CreditCard(ActionEvent event) throws Exception {

        FXMLLoader Loader = new FXMLLoader(getClass().getResource("/fxml/payment.fxml"));
        Parent root = (Parent) Loader.load();
        Stage primaryStage = new Stage();
        PaymentController display = Loader.getController();
        display.setName(name.getText());
        primaryStage.setTitle("Travel Solutions");
        primaryStage.setScene(new Scene(root, 460, 300));
        primaryStage.show();
        primaryStage.setResizable(false);
    }

    // Proceed to New Stage
    public void handleSubmitButton(ActionEvent event) throws Exception {

        FXMLLoader Loader = new FXMLLoader(getClass().getResource("/fxml/ticket.fxml"));
        Parent root = (Parent) Loader.load();
        Stage primaryStage = new Stage();
        Ticket ss = Loader.getController();
        ss.setName1(name.getText());
        primaryStage.setTitle("Travel Solutions");
        primaryStage.setScene(new Scene(root, 630, 420));
        primaryStage.show();
        primaryStage.setResizable(false);
    }
}
