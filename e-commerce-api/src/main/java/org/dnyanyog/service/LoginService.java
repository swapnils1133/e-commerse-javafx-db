package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.common.DBUtil;
import org.dnyanyog.dto.Login;

public class LoginService {
		
		public String login( Login loginbody) throws SQLException {
		
			String loginQuery = "select * from user where first_name='"+loginbody.user+"' and password='"+loginbody.password+"'";
			ResultSet result = DBUtil.executeSelectQuery(loginQuery);
            if(result.next()) {
                 return "login successfull";
            }else {
			return "login failed";
		}
	}
}

                                     