package travelApplication;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.ResourceBundle;

public class SearchFlightController implements Initializable {

    // Initialize Data-Fields
    @FXML
    private ComboBox <String> airliness;

    // Array of Elements
    ObservableList<String> airlinessList = FXCollections.observableArrayList("AirAsia" , "AirAsia X", "Firefly", "Malindo Air", "Malaysia Airlines",
                                            "MASwings");

    @FXML
    private ComboBox <String> FlyFromBox;

    // Array of Elements
    ObservableList<String> CityList = FXCollections.observableArrayList("Alor Setar" , "Bernam River", "Butterworth",
            "Bayan Lepas", "Gong Kedak", "Ipoh", "Teluk Intan" , "Kerteh", "Kluang",
            "Kota Bharu", "Kuala Terengganu", "Kuantan", "Langkawi" , "Batu Berendam", "Mersing",
            "Pangkor Island", "Redang Island", "Senai", "Sepang");

    @FXML
    private ComboBox <String> FlyToBox;

    @FXML
    private ComboBox <String> sCllass;

    // Array of Elements
    ObservableList<String> cllassList = FXCollections.observableArrayList("Bussiness" , "Economy");

    @FXML
    private AnchorPane rootpane;

    @FXML
    private DatePicker dept;
    @FXML
    private DatePicker returning;
    @FXML
    private TextField seat;

    // Method for setting initialize data-fields items for result
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        airliness.setItems(airlinessList);

        FlyFromBox.setItems(CityList);
        FlyToBox.setItems(CityList);
        sCllass.setItems(cllassList);
    }

    // Method for search result
    public void Search (ActionEvent event) throws Exception{

       String AirName =  airliness.getValue() ;
       String FlyFrom = FlyFromBox.getValue();
       String FlyTo = FlyToBox.getValue();
       String Departure = String.valueOf(dept.getValue());
       String Returning = String.valueOf(returning.getValue());
       String Seat = seat.getText();
       String SClas = sCllass.getValue();

       System.out.println(AirName + FlyFrom + FlyTo + Departure +  Returning + Seat + SClas);

        FXMLLoader Loader = new FXMLLoader(getClass().getResource("/fxml/availbleFlight.fxml"));
        AnchorPane pane = Loader.load();
        rootpane.getChildren().setAll(pane);

       // Parent root = (Parent) Loader.load();
        AvailbleFlightController display = Loader.getController();
        display.showFlight(AirName); // Main search Query
        display.showAll(FlyFrom,FlyTo,Departure,Returning,Seat,SClas); // passing search values to available Flight

    }
}
