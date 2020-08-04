package sample;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static connect_postgres.Shohoz_DbImpl.motorDriverList;
import static sample.Main.object;

public class DriverPromoFXML implements Initializable {
    public TableView<DriverPromo> tableField;
    public TableColumn<DriverPromo,String> nameField;
    public TableColumn<DriverPromo,Integer> driverIdField;
    public JFXButton backButton;
    public AnchorPane driverPromoPane;

    public void backButtonAction(ActionEvent actionEvent) {
        try {
            System.out.println("login ");
            AnchorPane pane = FXMLLoader.load(getClass().getResource("query.fxml"));
            driverPromoPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        object.driver_using_promo() ;

        //table view
        nameField.setCellValueFactory(new PropertyValueFactory<DriverPromo, String>("name"));
        driverIdField.setCellValueFactory(new PropertyValueFactory<DriverPromo, Integer>("driver_id"));
        tableField.setItems(getMember());
    }

    public ObservableList<DriverPromo> getMember()
    {
        ObservableList<DriverPromo> ride = FXCollections.observableArrayList();
        for (int i = 0; i < motorDriverList.size() ; i++) {
            ride.add(motorDriverList.get(i)) ;
        }
        return ride;
    }
}
