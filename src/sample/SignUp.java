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

public class SignUp {



    public AnchorPane signUpPane;
    public JFXTextField nameField;
    public JFXTextField phoneNumberField;
    public JFXTextField emailField;
    public JFXTextField HomeAddressField;
    public JFXPasswordField passwordField;
    public JFXPasswordField confirmpassword;
    public JFXButton saveButton;
    public JFXButton backButton;

    public String name ,phone ,email ,homeAdd , password ;

    public void saveButtonAction(ActionEvent actionEvent) {
        name = nameField.getText() ;
        phone = phoneNumberField.getText() ;
        email = emailField.getText() ;
        homeAdd = HomeAddressField.getText() ;
        if(passwordField.getText().equals(confirmpassword.getText()))
        {
            password = passwordField.getText() ;
        }

         // insert data into data base
        object.User_signUp(name,phone,email,homeAdd,password) ;
        object.ShowRideList() ;

        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("afterLogin.fxml"));
            signUpPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void backButtonAction(ActionEvent actionEvent) {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("login_or_signup.fxml"));
            signUpPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
