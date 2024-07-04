package usermanagement;

import add_user.AddUserScreen;
import delete_user.DeleteUserScreen;
import print_user.PrintUserScreen;
import search_user.SearchUserScreen;
import update_user.UpdateUserScreen;

public class UsermanagementScreenController {
	
	public void addUserButtonClick() {
		new AddUserScreen().show();
	}
	
	
	public void searchUserButtonClick() {
		new SearchUserScreen().show();
	}
	
	public void updateUserButtonClick() {
		new UpdateUserScreen().show();
	}
	
	
	public void printUserButtonClick() {
		new PrintUserScreen().show();
	}
	
	
	public void deleteUserButtonClick() {
		new DeleteUserScreen().show();
	}

}
