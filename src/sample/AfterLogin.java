package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static sample.Main.object;


public class AfterLogin {
    public AnchorPane afterPane;
    public JFXButton currentLocationButton;
    public JFXButton sentRequestButton;
    public JFXButton RideRecordButton;
    public JFXButton backButton;
    public Label locationField;
    public JFXButton queryButton;


    public void sentRequestButtonAction(ActionEvent actionEvent) {
        try {
            System.out.println("login ");
            AnchorPane pane = FXMLLoader.load(getClass().getResource("RequestSent.fxml"));
            afterPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void RideRecordButtonAction(ActionEvent actionEvent) {
        try {
            System.out.println("login ");
            AnchorPane pane = FXMLLoader.load(getClass().getResource("RideRecord.fxml"));
            afterPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void backButtonAction(ActionEvent actionEvent) {
        try {
            System.out.println("login ");
            AnchorPane pane = FXMLLoader.load(getClass().getResource("login.fxml"));
            afterPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void currentLocationButtonAction(ActionEvent actionEvent) {
        String loc = object.CurrentLocation() ;
        locationField.setText("Location : "+loc);
    }

    public void queryButtonAction(ActionEvent actionEvent) {
        try {
            System.out.println("login ");
            AnchorPane pane = FXMLLoader.load(getClass().getResource("query.fxml"));
            afterPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
