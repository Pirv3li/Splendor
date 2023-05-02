package gui;

import java.io.IOException;

import domein.Domeincontroller;
import javafx.scene.Parent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class UserLoginController extends Pane {

    @FXML private Button startButton;
	
    @FXML
    private TextField usernameField;

    @FXML
    private TextField birthYearField;

    @FXML
    private Button loginButton;

    private Domeincontroller dc;
    
    public UserLoginController () {
    	dc = new Domeincontroller();
    }
    
    public void onClick() {
        String naam = usernameField.getText();
        int geboortejaar = Integer.parseInt(birthYearField.getText());
        dc.voegSpelerToe(naam, geboortejaar);
        usernameField.clear();
        birthYearField.clear();
    }
    
    @FXML
    public void onClickStart() {
        dc.startSpel();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("spelbord.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            SpelBordController spelBordController = loader.getController();
            spelBordController.setDC(dc); // pass the data controller to the new controller
            Stage stage = (Stage) startButton.getScene().getWindow(); // get the current stage
            stage.setScene(scene); // set the new scene
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

