package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static sample.Main.object;

public class RequestSent {
    public AnchorPane requestPane;
    public JFXTextField sourcefield;
    public JFXTextField typeField;
    public JFXTextField destinationField;
    public JFXButton backButton;
    public JFXButton sentreqButton;

    public String source ;
    public static String destination ;
    public String type ;
    public void backButtonAction(ActionEvent actionEvent) {
        try {
            System.out.println("login ");
            AnchorPane pane = FXMLLoader.load(getClass().getResource("afterLogin.fxml"));
            requestPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sentreqButtonAction(ActionEvent actionEvent) {
        source = sourcefield.getText() ;
        destination = destinationField.getText() ;
        type = typeField.getText() ;
        object.Load_Graph_AND_Request(source,destination,type);
        try {
            System.out.println("login ");
            AnchorPane pane = FXMLLoader.load(getClass().getResource("afterrequest.fxml"));
            requestPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
