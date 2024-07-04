package delete_user;

import java.sql.SQLException;

import common.DBUtil;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DeleteUserScreenController {
	
	@FXML
	TextField nameToDelete;
	
	@FXML
	TextField deleteMessage;
	
	public void deleteUserClick() throws SQLException {
		
		String searchname = nameToDelete.getText();
		String deletequery = "delete from user where first_name='"+searchname+"'";
		DBUtil.executequery(deletequery);
		deleteMessage.setText("User Deleted Successfully !.....");
	}

}
