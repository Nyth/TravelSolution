package travelApplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class AvailbleFlightController implements Initializable {

    // Initialize Data-Fields
    @FXML
    private TableView <FlightDetails> flights;

    @FXML
    private TableColumn<FlightDetails, String> flightNo,flightName,depTime,Fare;

    // Method for setting items for available flight results
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        flightNo.setCellValueFactory(new PropertyValueFactory<>("flightNo"));
        flightName.setCellValueFactory(new PropertyValueFactory<>("flightName"));
        depTime.setCellValueFactory(new PropertyValueFactory<>("depTime"));
        Fare.setCellValueFactory(new PropertyValueFactory<>("Fare"));
    }

    // Method for displaying flight results
    public void showFlight(String airliness) {

       switch(airliness){

           case "AirAsia" :
               flights.getItems().add(new FlightDetails("AA213","Air Asia","07:00 AM","220 RM"));
               flights.getItems().add(new FlightDetails("AA985","Air Asia","07:30 AM","150 RM"));
               flights.getItems().add(new FlightDetails("AA650","Air Asia","08:00 AM","145 RM"));
               flights.getItems().add(new FlightDetails("AA325","Air Asia","09:00 AM","153 RM"));
               break;
           case "AirAsia X" :
               flights.getItems().add(new FlightDetails("AAX20","AirAsia X","08:00 AM","320 RM"));
               flights.getItems().add(new FlightDetails("AAX98","AirAsia X","03:00 AM","120 RM"));
               flights.getItems().add(new FlightDetails("AAX56","AirAsia X","10:00 PM","123 RM"));
               flights.getItems().add(new FlightDetails("AAX45","AirAsia X","07:00 AM","454 RM"));
               break;
           case "Firefly" :
               flights.getItems().add(new FlightDetails("FF014","Firefly","07:00 AM","154 RM"));
               flights.getItems().add(new FlightDetails("FF154","Firefly","07:00 AM","202 RM"));
               flights.getItems().add(new FlightDetails("FF458","Firefly","07:00 AM","125 RM"));
               flights.getItems().add(new FlightDetails("FF487","Firefly","07:00 AM","150 RM"));
               break;
           case "Malindo Air" :
               flights.getItems().add(new FlightDetails("MA791","Malindo Air","07:00 AM","150 RM"));
               flights.getItems().add(new FlightDetails("MA545","Malindo Air","07:00 AM","150 RM"));
               flights.getItems().add(new FlightDetails("MA456","Malindo Air","07:00 AM","150 RM"));
               flights.getItems().add(new FlightDetails("MA059","Malindo Air","07:00 AM","150 RM"));
               break;
           case "Malaysia Airlines" :
               flights.getItems().add(new FlightDetails("MH545","Malaysia Airlines","07:00 AM","150 RM"));
               flights.getItems().add(new FlightDetails("MH054","Malaysia Airlines","07:00 AM","150 RM"));
               flights.getItems().add(new FlightDetails("MH014","Malaysia Airlines","07:00 AM","150 RM"));
               flights.getItems().add(new FlightDetails("MH557","Malaysia Airlines","07:00 AM","150 RM"));
               break;
           case "MASwings" :
               flights.getItems().add(new FlightDetails("MH110","MASwings","07:00 AM","150 RM"));
               flights.getItems().add(new FlightDetails("MH110","MASwings","07:00 AM","150 RM"));
               flights.getItems().add(new FlightDetails("MH110","MASwings","07:00 AM","150 RM"));
               flights.getItems().add(new FlightDetails("MH110","MASwings","07:00 AM","150 RM"));
               break;
        }
    }

    private String FlyFrom, FlyTo, Dept, Retrn, Seat, sClass;

    // Method for displaying flight results
    public void showAll(String FlyFrom, String FlyTo,String Dept, String Retrn, String Seat, String sClass){

        this.FlyFrom = FlyFrom;
        this.FlyTo = FlyTo;
        this.Dept = Dept;
        this.Retrn = Retrn;
        this.Seat = Seat;
        this.sClass = sClass;
    }

    // Method for result submission
    public void handleSubmitButton(ActionEvent event) throws Exception {

        String fn = flights.getSelectionModel().getSelectedItem().getFlightNo();
        String fname = flights.getSelectionModel().getSelectedItem().getFlightName();
        String Dt = flights.getSelectionModel().getSelectedItem().getDepTime();
        String fare = flights.getSelectionModel().getSelectedItem().getFare();

        FXMLLoader Loader = new FXMLLoader(getClass().getResource("/fxml/alertConfirm.fxml"));
        Parent root = (Parent) Loader.load();
        AlertConfirmController display = Loader.getController();
        display.showData(fn, fname, Dt, fare, FlyFrom, FlyTo, Dept, Retrn, Seat, sClass);

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Travel Solutions");
        primaryStage.setScene(new Scene(root, 400, 340));
        primaryStage.show();
        primaryStage.setResizable(false);
    }
}
