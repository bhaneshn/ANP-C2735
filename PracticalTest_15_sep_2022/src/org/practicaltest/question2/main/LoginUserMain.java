package org.practicaltest.question2.main;

import java.util.Scanner;

import org.practicaltest.question2.view.LoginUserView;

public class LoginUserMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("1: Add user details");
			System.out.println("2: Display user details");
			System.out.println("3: Exit");
			System.out.println();
			System.out.println("Enter your choice");
			
			int choice=scanner.nextInt();
			switch(choice) {
			
			case 1:
				LoginUserView.getUserDetails();
				break;
			case 2:
				LoginUserView.displayUserDetails();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Your choice is Invalid !.....Please Enter valid Details");
			}
		}
	}
}
