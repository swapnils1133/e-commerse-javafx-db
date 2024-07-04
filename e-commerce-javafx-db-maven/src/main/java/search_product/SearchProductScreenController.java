package search_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import common.DBUtil;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SearchProductScreenController {
	
	@FXML
	TextField productName;
	
	@FXML
	TextField productQuantity;
	
	@FXML
	TextField productPrice;
	
	@FXML
	TextField nameToSearch;
	
	@FXML
	TextField searchMessage;
	
	
	public void searchProductClick() throws SQLException {
		
		String searchname = nameToSearch.getText();
		String query = "select * from product where product_name='"+searchname+"'";
		ResultSet resultset = DBUtil.executeSelectQuery(query);
		if(resultset.next()) {
			productName.setText(resultset.getString(1));
			productQuantity.setText(resultset.getString(2));
			productPrice.setText(resultset.getString(3));
			
			searchMessage.setText("Product Search Successfully");
		}else {
			searchMessage.setText("Product Not Found");
		}
	}


}
