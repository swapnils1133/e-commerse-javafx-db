package login;

import java.net.URL;
import java.nio.file.Paths;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginScreenView extends Application{

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		URL fxmlUrl = Paths.get("C:\\Users\\swapn\\eclipse-workspace\\e-commerse-javafx-db\\src\\login\\LoginScreen.fxml")
				.toUri() .toURL();	
		
		Parent actorGroup = FXMLLoader.load(fxmlUrl);
		stage.setTitle("Student Login");
		Scene scene = new Scene(actorGroup, 1300, 800);
		stage.setScene(scene);
		stage.show();
	}
}
