package main;
import javafx.application.Application;
import gui.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import ui.SplendorApp;

public class SplendorStart extends Application {
	public static void main (String[] args) {
		SplendorApp splendor = new SplendorApp();
//		UserLoginController usrlogin = new UserLoginController();
		splendor.SplendorAppStart();
	}


	/**
	 * Start the GUI of the game
	 * @param primaryStage Primary stage of the Game
	 */
	@Override
	public void start(Stage primaryStage) {
	    UserLoginController usrlogin = new UserLoginController();
	    StackPane root = new StackPane();
	    root.getChildren().add(usrlogin);
	    Scene scene = new Scene(root);
	    scene.getStylesheets().addAll(this.getClass().getResource("view/resource/Style.css").toExternalForm());
	    primaryStage.setScene(scene);
	    primaryStage.setTitle("Splendor");
	    primaryStage.sizeToScene();
	    primaryStage.setResizable(false);
	    primaryStage.show();
	}

}


//    public void start(Stage stage)
//    {
//        DomeinController controller = new DomeinController();
//       
//        Scene scene = new Scene(bs);
//        stage.setScene(scene);
//        stage.setTitle("Beheerskosten");
//        stage.show();
//    }
//
//    public static void main(String[] args)
//    {
//        launch(args);
//    }
//}
