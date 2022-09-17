package org.practicaltest.service.question2;

import org.practicaltest.dao.question2.LoginUserDAO;
import org.practicaltest.model.question2.LoginUser;

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
