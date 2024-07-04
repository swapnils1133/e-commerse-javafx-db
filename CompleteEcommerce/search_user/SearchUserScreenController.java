package search_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import common.DBUtil;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SearchUserScreenController {

	@FXML
	TextField nameToSearch;
	
	@FXML
	TextField userFirstname;
	
	@FXML
	TextField userLastname;
	
	@FXML
	TextField gender;
	
	@FXML
	TextField age;
	
	@FXML
	TextField email;
	
	@FXML
	TextField password;
	
	@FXML
	TextField confirmPassword;
	
	@FXML
	TextField searchMessage;
	
	public void searchUserClick() throws SQLException {
		
		String searchname = nameToSearch.getText();
		String query = "select * from user where first_name='"+searchname+"'";
		ResultSet resultset = DBUtil.executeSelectQuery(query);
		if(resultset.next()) {
			userFirstname.setText(resultset.getString(1));
			userLastname.setText(resultset.getString(2));
			gender.setText(resultset.getString(3));
			age.setText(resultset.getString(4));
			email.setText(resultset.getString(5));
			password.setText(resultset.getString(6));
			
			searchMessage.setText("User Search Successfully");
		}else {
			searchMessage.setText("User Not Found");
		}
	}

}
