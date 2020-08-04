package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static sample.Main.object;

public class Query {
    public AnchorPane queryPane;
    public Label carTripfield;
    public Label motortripField;
    public JFXButton carTripButton;
    public JFXButton tripPromoCodeButton;
    public JFXButton driverPromoCodeButton;
    public JFXButton userPromoCodeButton;
    public JFXButton motorTripButton;
    public JFXButton backButton;

    public void carTripButtonAction(ActionEvent actionEvent) {
        int trips = object.Count_carTrips() ;
        carTripfield.setText("Total car Trips : "+ trips );
    }

    public void tripPromoCodeButtonAction(ActionEvent actionEvent) {
        try {
            System.out.println("login ");
            AnchorPane pane = FXMLLoader.load(getClass().getResource("tripPromoFXML.fxml"));
            queryPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void driverPromoCodeButtonAction(ActionEvent actionEvent) {
        try {
            System.out.println("login ");
            AnchorPane pane = FXMLLoader.load(getClass().getResource("DriverPromoFXML.fxml"));
            queryPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void userPromoCodeButtonAction(ActionEvent actionEvent) {
        try {
            System.out.println("login ");
            AnchorPane pane = FXMLLoader.load(getClass().getResource("passengerPromoFXML.fxml"));
            queryPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void motorTripButtonAction(ActionEvent actionEvent) {
        int trips = object.Count_motorTrips() ;
        motortripField.setText("Total car Trips : "+ trips );
    }

    public void backButtonAction(ActionEvent actionEvent) {
        try {
            System.out.println("login ");
            AnchorPane pane = FXMLLoader.load(getClass().getResource("afterLogin.fxml"));
            queryPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
