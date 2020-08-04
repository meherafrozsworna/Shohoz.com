package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import connect_postgres.Shohoz_DbImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static sample.Main.object;

public class Login {

    //public static Shohoz_DbImpl object ;

    public AnchorPane loginPane;
    public JFXTextField phone_id;
    public JFXPasswordField password;
    public JFXButton loginButton;
    public JFXButton back_button;
    public String phone ;
    public String pass ;

    public void loginAction(ActionEvent actionEvent) {
        phone = phone_id.getText() ;
        pass = password.getText() ;
        System.out.println(phone+ "  " + pass);
        //object = new Shohoz_DbImpl() ;
        //object.connect();
        int passengerId = object.login_db(phone,pass) ;
        if( passengerId != 0)
        {
            object.ShowRideList() ;

            try {
                AnchorPane pane = FXMLLoader.load(getClass().getResource("afterLogin.fxml"));
                loginPane.getChildren().setAll(pane);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public void BackAction(ActionEvent actionEvent) {
        try {
            System.out.println("login ");
            AnchorPane pane = FXMLLoader.load(getClass().getResource("login_or_signup.fxml"));
            loginPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
