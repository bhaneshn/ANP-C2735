package com.mybank.service;

public class LoanAccountService {
	private int loanId;
	private int loanAmount;   // Here we define instance variable
	private int rateOfInterest;
	private int time;
	
	public int calculateInterest( int LoanAmount,int RateOfInterest,int Time) {
		
		loanAmount=LoanAmount;
		rateOfInterest=RateOfInterest;   //this is method name where we accept all method
		time=Time;                     
		int SI=(loanAmount*rateOfInterest*time)/100;//here we calculate the interest and
		return SI;                     // return the interest which ask in the question
	}
	
	
	
	
}
