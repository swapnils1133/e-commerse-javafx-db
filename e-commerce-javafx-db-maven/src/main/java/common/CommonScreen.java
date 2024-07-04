package common;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class CommonScreen {
	
    public void show() {
    	
    	String myClassName = getClass().getSimpleName();
    	
    	String classFilePath = getClass().getResource(myClassName+".class").toString();
    	
    	String fxmlFilePath = classFilePath.replace(".class", ".fxml");
    	System.out.println(fxmlFilePath);
    	String actualPath=fxmlFilePath.substring(8);
		URL fxmlUrl;
		try {
			fxmlUrl= Paths.get(actualPath).toUri() .toURL();
	
		Parent actorGroup = FXMLLoader.load(fxmlUrl);
		StageHolder.stage.setTitle("Add Product Screen");
		Scene scene = new Scene(actorGroup, 1200, 800);
		StageHolder.stage.setScene(scene);
		StageHolder.stage.show();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
