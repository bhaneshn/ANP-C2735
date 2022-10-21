package org.practicaltest.question2.view;

import java.util.Scanner;

import org.practicaltest.question2.model.LoginUser;
import org.practicaltest.question2.service.LoginUserService;
import org.practicaltest.question2.service.PasswordFormatException;

public class LoginUserView {

	static Scanner scanner=new Scanner(System.in);
	
	public static void getUserDetails() {
		LoginUser user=new LoginUser();
		
		System.out.println("Please enter your Username");
		user.setUsername(scanner.nextLine());
		
		System.out.println("Please enter your Password");
		user.setPassword(scanner.nextLine());
		
		try {
			if(user.getPassword().length()<6) {
				throw new PasswordFormatException("Length of password is less than 6");
			}
			System.out.println(LoginUserService.setUserDetails(user));
		}catch(PasswordFormatException e) {
			System.out.println("Incorrect: "+e.getMessage());
			System.out.println();
			System.out.println("Enter Details Again");
			System.out.println();
		}
	}
	
		public static LoginUser[] displayUserDetails() {
			LoginUser[]userArray=LoginUserService.displayUserDetails();
			int i=0;
			while(userArray[i]!=null) {
				System.out.println(userArray[i]);
				i++;
			}
			return userArray;
		}
	}

