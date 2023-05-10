package gui;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import domein.Domeincontroller;
import gui.SpelBordController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UserLoginController extends Pane {

    @FXML
    private Button startButton;
    
    @FXML
    private Text titleLabel;

    @FXML
    private Label usernameLabel;
    
    @FXML
    private Label birthYearLabel;
    
    @FXML
    private Button loginButton;
    
    @FXML
    private TextField usernameField;

    @FXML
    private TextField birthYearField;

    private Domeincontroller dc;
    private ResourceBundle bundle;

    public void setDc(Domeincontroller dc) {
        this.dc = dc;
    }

    public void setResourceBundle(ResourceBundle bundle) {
        this.bundle = bundle;
        titleLabel.setText(bundle.getString("login"));
        usernameLabel.setText(bundle.getString("name"));
        birthYearLabel.setText(bundle.getString("birth"));
        loginButton.setText(bundle.getString("addplayer"));
        startButton.setText(bundle.getString("start"));
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
        dc.setstartSpelerIndex();
        dc.setOntwikkelingskaartenOverzichtEnEdelenOverzicht();
        dc.setOntwikkelingskaartenDtos();
        dc.setEdelstenenAantalDto();
        dc.setEdelenDto();
        dc.setInventoryDto();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/spelbord.fxml"));
            loader.setResources(bundle);
            Parent root = loader.load();
            Scene scene = new Scene(root);

            SpelBordController spelBordController = loader.getController();
            spelBordController.setDc(dc);

            Stage stage = (Stage) startButton.getScene().getWindow(); // get the current stage
            stage.setScene(scene); // set the new scene
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Step 4: Load the resource bundle based on the default locale
    public void initialize() {
        Locale currentLocale = Locale.getDefault();
        bundle = ResourceBundle.getBundle("gui.messages", currentLocale);
        titleLabel.setText(bundle.getString("login"));
        usernameField.setPromptText(bundle.getString("name"));
        birthYearField.setPromptText(bundle.getString("birth"));
        loginButton.setText(bundle.getString("addplayer"));
        startButton.setText(bundle.getString("start"));
    }
}
