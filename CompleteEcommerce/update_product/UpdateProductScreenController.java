package update_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import common.DBUtil;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class UpdateProductScreenController {
	
	@FXML
	TextField productName;
	
	@FXML
	TextField productQuantity;
	
	@FXML
	TextField productPrice;
	
	@FXML
	TextField nameToUpdate;
	
	@FXML
	TextField updateMessage;
	
	public void enterUpdateClick() throws SQLException {
	    
		String updatename = nameToUpdate.getText();
		String query = "select * from product where product_name='"+updatename+"'";
		ResultSet resultset = DBUtil.executeSelectQuery(query);
		if(resultset.next()) {
			updateMessage.setText("Enter New Detail Of Product Below:");
		}else {
			updateMessage.setText("Product Not Found");
		}
	}
	
	public void updateUserClick() throws SQLException {
		String updatename = nameToUpdate.getText();
		String pname = productName.getText();
		String pquantity = productQuantity.getText();
		String pprice = productPrice.getText();
	
			String query = "update product set  product_name = '"+pname+"', product_quantity='"+pquantity+"' , product_price='"+pprice+"' ";
			DBUtil.executequery(query);
			updateMessage.setText("Product Updated Successfully");
		}


}
