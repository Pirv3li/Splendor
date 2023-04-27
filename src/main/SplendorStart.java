package main;
import java.io.IOException;

import domein.Domeincontroller;
import javafx.scene.Parent;
import gui.UserLoginController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import ui.SplendorApp;

public class SplendorStart extends Application {
	@FXML public BorderPane content;
	
    @Override
    public void start(Stage stage) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/UserLogin.fxml"));
    	loader.setRoot(content); 	
    	  Parent root = loader.load();
    	  Domeincontroller dc = new Domeincontroller();
          Scene scene = new Scene(root, 500, 400);
          //scene.getStylesheets().add("file:///C:/SD_Project1/splendor-g_61/src/cssStyle/LoginStyle"); // moet een andere pad dit gaat niet bij iedereen werken
          stage.setScene(scene);
          stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

