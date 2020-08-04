package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static sample.Main.object;

public class Afterrequest {
    public AnchorPane afterReqPane;
    public Label paymentField;
    public JFXButton paymentAmountButton;
    public JFXButton currentTripButton;
    public JFXButton DriverButton;
    public JFXButton RidePathButton;
    public JFXButton backButton;

    public void paymentAmountButton(ActionEvent actionEvent) {
        double amount = object.paymentAmount() ;
        paymentField.setText("Payment Amount : " + amount);
    }

    public void currentTripButtonAction(ActionEvent actionEvent) {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("currentTrip.fxml"));
            afterReqPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void DriverButtonActiion(ActionEvent actionEvent) {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("nearbyDriver.fxml"));
            afterReqPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void RidePathButtonAction(ActionEvent actionEvent) {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("tripPath.fxml"));
            afterReqPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void backButtonAction(ActionEvent actionEvent) {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("RequestSent.fxml"));
            afterReqPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
