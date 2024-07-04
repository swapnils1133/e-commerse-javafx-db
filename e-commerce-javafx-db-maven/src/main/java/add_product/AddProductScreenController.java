package add_product;

import java.sql.SQLException;

import common.DBUtil;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddProductScreenController {
	
	@FXML
	TextField productName;
	
	@FXML
	TextField productQuantity;
	
	@FXML
	TextField productPrice;
	
	public void addProductClick() throws SQLException {
		
		String pName = productName.getText();
		String pQuantity = productQuantity.getText();
		String pPrice = productPrice.getText();
		
		String query = "insert into product(product_name, product_quantity, product_price) values('"+pName+"','"+pQuantity+"','"+pPrice+"')";
		DBUtil.executequery(query);
		System.out.println("Add product Successfully");
	}


}
