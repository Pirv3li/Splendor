package gui;

import domein.Domeincontroller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class UserLoginController extends Pane {

    @FXML
    private TextField usernameField;

    @FXML
    private TextField birthYearField;

    @FXML
    private Button loginButton;

    private Domeincontroller dc;
    
    public void onClick() {
    	dc = new Domeincontroller();
        String naam = usernameField.getText();
        int geboortejaar = Integer.parseInt(birthYearField.getText());
        dc.voegSpelerToe(naam, geboortejaar);
    }

}

