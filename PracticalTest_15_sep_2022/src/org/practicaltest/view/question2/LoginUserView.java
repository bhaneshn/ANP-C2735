package org.practicaltest.view.question2;

import java.util.Scanner;

import org.practicaltest.model.question2.LoginUser;
import org.practicaltest.service.question2.LoginUserService;
import org.practicaltest.service.question2.PasswordFormatException;

public class LoginUserView {

	static Scanner scanner=new Scanner(System.in);
	
	public static void getUserDetails() {
		LoginUser user=new LoginUser();
		
		System.out.println("Please enter your Username");
		user.setUsername(scanner.nextLine());
		
		System.out.println("Please enter your Password");
		user.setPassword(scanner.nextLine());
		
		try {
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

