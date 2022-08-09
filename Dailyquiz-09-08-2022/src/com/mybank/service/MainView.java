package com.mybank.service;
import com.mybank.service.LoanAccountService;
public class MainView {
	
	public static void main(String[] args ) {  // here we define main method inside MainView
		
		LoanAccountService interest1=new LoanAccountService(); 
		
		int Interest=interest1.calculateInterest(1000,5,2);// here we called calculateInterest inside the main method
		
		System.out.println("  Interest is : "+ Interest);
	} //here we print the interest inside the main method
}
