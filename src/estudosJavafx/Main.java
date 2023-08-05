package estudosJavafx;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	public void start(Stage primaryStage) throws IOException {
		
		AnchorPane root = FXMLLoader.load(getClass().getResource("FirstProject.fxml"));
		Scene scene = new Scene(root, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
