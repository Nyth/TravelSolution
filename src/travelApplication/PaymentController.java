package travelApplication;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;

public class PaymentController implements Initializable {

    @FXML
    private TextField name;
    @FXML
    private ComboBox<String> month;
    ObservableList<String> monthList = FXCollections.observableArrayList("01" , "02", "03", "04", "05","06" ,
                                            "07", "08", "09", "10","11", "12");
    @FXML
    private ComboBox<String> year;
    ObservableList<String> yearList = FXCollections.observableArrayList("2019" , "2020", "2021", "2022", "2023","2024" ,
            "2025", "2026", "2027", "2028","2029", "2030");

    @FXML
    private Button bttn_continue;

    @FXML
    private RadioButton visa;

    @FXML
    private RadioButton masterCard;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        month.setItems(monthList);
        year.setItems(yearList);
    }

    public void setName(String username){

        this.name.setText(username);
    }

    public void exitButton(ActionEvent event) throws Exception {

        Stage stage = (Stage) bttn_continue.getScene().getWindow();
        stage.close();
    }
}


