package add_user;

import java.sql.SQLException;

import common.DBUtil;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddUserScreenController {
	
	
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
	
	public void addUserClick() throws SQLException {
		String firstnames = userFirstname.getText();
		String lastnames = userLastname.getText();
		String genders = gender.getText();
		String ages = age.getText();
		String emails = email.getText();
		String passwords = password.getText();
		String confirmPasswords = confirmPassword.getText();
		if(passwords.equals(confirmPasswords)) {
			String query = "insert into user(first_name, last_name, gender, age, email, password) values ('"+firstnames+"','"+lastnames+"','"+genders+"','"+ages+"','"+emails+"','"+passwords+"')";
			DBUtil.executequery(query);
			System.out.println("User Added Successfully");
		}else {
			System.out.println("User Addition Failed");
		}
	}


}
