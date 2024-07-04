package home;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import productmanagement.ProductmanagementScreen;
import usermanagement.UsermanagementScreen;

public class HomeScreenController {
	
	@FXML
	Button addUser;
	
	@FXML
	Button addProduct;
	
	@FXML
	Button logout;
	
	public void usermanagement() {
		System.out.println("Usermanagement Button Clicked");
		new UsermanagementScreen().show();
	}
	
	public void productmanagement() {
		System.out.println("Productmanagement Button Clicked");
	    new ProductmanagementScreen().show();
	}
	
	public void logOutButtonClick() {
		System.out.println("logout Button Clicked");
	}


}
