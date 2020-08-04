package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static connect_postgres.Shohoz_DbImpl.*;
import static sample.Main.object;
import static sample.RequestSent.destination;

public class CurrentTrip implements Initializable{
    public AnchorPane currentTripPane;
    public Label locationField;
    //public Label elapsedTimeField;
    public Label elapsedDistancreField;
    public JFXButton backButton;
    public JFXButton UpdateButton;

    public static int count_trip = 0 ;
    public void backButtonAction(ActionEvent actionEvent) {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("afterrequest.fxml"));
            currentTripPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void UpdateButtonAction(ActionEvent actionEvent) {
        count_trip++ ;
        object.Update_current_trip();
        locationField.setText(path_list.get(count_trip));
        String str = (int) distance[path_id_list.get(count_trip)] + "" ;
        elapsedDistancreField.setText(str);

        rideList.clear();
        object.ShowRideList() ;

        if(destination.equals(locationField.getText()))
        {
            try {
                AnchorPane pane = FXMLLoader.load(getClass().getResource("RideFinish.fxml"));
                currentTripPane.getChildren().setAll(pane);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        locationField.setText(path_list.get(0));
        String str = (int) distance[path_id_list.get(0)] + "" ;
        elapsedDistancreField.setText(str);
    }
}
