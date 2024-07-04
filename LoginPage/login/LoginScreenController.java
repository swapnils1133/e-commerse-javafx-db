package login;

import java.sql.ResultSet;
import java.sql.SQLException;

import common.DBUtil;
import home.HomeScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginScreenController {
	@FXML
	TextField loginName;
	
	@FXML
	TextField password;
	
	@FXML
	Label errorMessage;

	public  void loginButtonClick() throws SQLException {
		
		String userName = loginName.getText();
		String passwords = password.getText();
		
		String selectQuery = "select * from user where  first_name= '"+userName+"' && password='"+passwords+"' ";
		ResultSet resultset = DBUtil.executeSelectQuery(selectQuery);
		if(resultset.next()) {
			errorMessage.setText("Login Successfully !.....");
			errorMessage.setTextFill(Color.GREEN);
			new HomeScreen().show();
			
		}else {
			errorMessage.setText("Login Failed !!!!");
			errorMessage.setTextFill(Color.RED);
		}
	}
}
