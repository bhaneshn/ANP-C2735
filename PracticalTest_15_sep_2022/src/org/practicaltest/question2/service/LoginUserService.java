package org.practicaltest.question2.service;

import org.practicaltest.question2.dao.LoginUserDAO;
import org.practicaltest.question2.model.LoginUser;

public class LoginUserService {

	static public String setUserDetails(LoginUser user)throws PasswordFormatException {
		if(user.getPassword().length()<6) {
			throw new PasswordFormatException("Length of password is less than 6");
		}
		return LoginUserDAO.setUserDetails(user);
	}
	public static LoginUser[] displayUserDetails() {
		return LoginUserDAO.displayUserDetails();
	}
}
