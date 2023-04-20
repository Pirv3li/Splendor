package gui;
import domein.Domeincontroller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class UserLoginController extends Pane {
	
	Domeincontroller dc;

    @FXML
    private TextField usernameField;

    @FXML
    private TextField birthYearField;

    @FXML
    private Button loginButton;

    @FXML
    private Hyperlink forgotPasswordLink;

    public void initialize() {
        // event handlers for button and hyperlink
    	dc = new Domeincontroller();
    	String naam = usernameField.getText();
    	int geboortejaar = Integer.parseInt(birthYearField.getText());
    	dc.voegSpelerToe(naam, geboortejaar);
    	
    }

}
