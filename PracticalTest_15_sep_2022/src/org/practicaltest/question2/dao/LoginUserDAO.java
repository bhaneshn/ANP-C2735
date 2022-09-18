package org.practicaltest.question2.dao;

import org.practicaltest.question2.model.LoginUser;

public class LoginUserDAO {

	static LoginUser []loginArray=new LoginUser[100];
	public static String setUserDetails(LoginUser user) {
		for(int i=0;i<loginArray.length;i++) {
			if(loginArray[i]==null)
				loginArray[i]=user;
				break;
		}
		return "Details Added Successfully";
	}
	
	public static LoginUser[] displayUserDetails() {
		return loginArray;
	}
}
