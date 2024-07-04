package update_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import common.DBUtil;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class UpdateUserScreenController {
	
	@FXML
	TextField nameToUpdate;
	
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
	TextField updateMessage;
	
	public void enterUpdateButtonClick() throws SQLException {
		
		String updatename = nameToUpdate.getText();
		String query = "select * from user where first_name='"+updatename+"'";
		ResultSet resultset = DBUtil.executeSelectQuery(query);
		if(resultset.next()) {
			updateMessage.setText("Enter New Detail Of User Below:");
		}else {
			updateMessage.setText("User Not Found");
		}
	}
	
	public void updateUserClick() throws SQLException {
		String updatename = nameToUpdate.getText();
		String fname = userFirstname.getText();
		String lname = userLastname.getText();
		String genders = gender.getText();
		String ages = age.getText();
		String emails = email.getText();
		String passwords = password.getText();
		String confirmPasswords = confirmPassword.getText();
		
		if(passwords.equals(confirmPasswords)) {
			String query = "update user set  first_name = '"+fname+"', last_name='"+lname+"' , gender='"+genders+"', age='"+ages+"', email='"+emails+"',"
					+ "password='"+passwords+"' where  first_name='"+updatename+"'" ;
			DBUtil.executequery(query);
			updateMessage.setText("User Updated Successfully");
		}
		else {
			updateMessage.setText("User Updating Failed");
		}
	}

}
