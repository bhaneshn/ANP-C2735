package org.test.model;

public class Customer {

	private String accountName;
	private int accountNumber;
	private double accountBalance;
	
	
	public void createAccount(int accNumber,String accName,double accBalance) {
		this.accountBalance=accBalance;
		this.accountName=accName;
		this.accountNumber=accNumber;
	}
	
	public void setAmount(int amount) {
		this.accountBalance+=amount;
		System.out.println("this is the amount after adding "+accountBalance);
	}
	
	public void withDrawnAmount() {
		if(this.accountBalance - 200 > 0) {
			System.out.println("Your account balance is "+ accountBalance +" left");
		}
	}
	
	public void getAmount() {
	
			System.out.println("hello "+accountName+" your account balance is  "+accountBalance);
		}
			
	
	
	
}
