package org.example.model;

public class customer {//class with instance variables as like as an object
	private int customerId;
	private String customerName;
	

	public customer(){  // this is empty constructor or default constructor
		
	}

	public customer(int customerId  , String customerName) {
		this.customerId=customerId;
		this.customerName=customerName;   //constructor with parameter
		
	
		
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}
	public String getCustomerName() {
		return customerName;
		
	}
	public void setcustomerName(String customerName) {
		this.customerName=customerName;
	}
	
}

	
