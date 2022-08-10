package org.example.model;

public class customer {
	private int customerId;
	private String customerName;
	public customer(){
		
	}

	public customer(int customerId , String customerName) {
		this.customerId=customerId;
		this.customerName=customerName;
		
	
		
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

	
