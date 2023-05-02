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
          Scene scene = new Scene(root, 900, 600);
          scene.getStylesheets().add("/css/LoginStyle.css");
          stage.setScene(scene);
          stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
        SplendorApp speel = new SplendorApp();
        speel.SplendorAppStart();
    }
}

