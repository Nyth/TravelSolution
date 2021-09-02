package travelApplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class AlertConfirmController implements Initializable {

    // Initialize Data-Fields
    @FXML
    private TextFlow text;

    @FXML
    private Text textData;

    @FXML
    private Button cancel;

    @FXML
    private Button confirm;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Empty
    }

    // Method for displaying results
    public void showData(String fn,String fname,String Dptime,String fare,String FlyFrom,String FlyTo, String DptDate,String RtrnDate, String St, String SClass){

      textData.setText("Flight No : " + fn + "\nFlight Name : " + fname + "\nDepature Time : " +  Dptime + "\nFlying From : " + FlyFrom + "\nFlying To : " + FlyTo + "\n Depature Date : "
                        + DptDate + "\nReturn Date : " + RtrnDate + "\n Number Of Seat : " +  St + "\nClass : "+ SClass + "\nFare : " + fare + " * " + St);

    }

    // Proceed to new Stage
    public void ContinButtn (ActionEvent event) throws Exception {

        FXMLLoader Loader = new FXMLLoader(getClass().getResource("/fxml/userRegistration.fxml"));

        Parent root = (Parent) Loader.load();
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Travel Solutions");
        primaryStage.setScene(new Scene(root, 650, 450));
        primaryStage.show();
        Stage stage = (Stage) cancel.getScene().getWindow();
        stage.close();
        // primaryStage.setResizable(false);
    }

    public void exitButton(ActionEvent event) throws Exception {

        Stage stage = (Stage) cancel.getScene().getWindow();
        stage.close();
    }
}
