package ecommerce;

import common.StageHolder;
import javafx.application.Application;
import javafx.stage.Stage;
import login.LoginScreen;


public class EcommerceMain extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stageCreatedByJavaFX) throws Exception {

		StageHolder.stage = stageCreatedByJavaFX;
		new LoginScreen().show();
	}


}
