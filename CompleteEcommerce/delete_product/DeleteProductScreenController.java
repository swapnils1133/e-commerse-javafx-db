package delete_product;

import java.sql.SQLException;

import common.DBUtil;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DeleteProductScreenController {
	
	@FXML
	TextField nameToDelete;
	
	@FXML
	TextField deleteMessage;
	
	
	public void deleteProductClick() throws SQLException {
		
		String searchname = nameToDelete.getText();
		String deletequery = "delete from product where product_name='"+searchname+"'";
		DBUtil.executequery(deletequery);
		deleteMessage.setText("Product Deleted Successfully !.....");
	}


}
