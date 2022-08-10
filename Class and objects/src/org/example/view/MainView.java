package org.example.view;
import org.example.model.customer;

public class MainView {
	
	int getcustomerIdfromcustomer(customer custObj) {
		int custId=custObj.getCustomerId();  // calling method
		return custId;
	
	
	}
	String getcustomerNameCromCustId(int custId) {
		String name="Bhanesh";
		return name;
	}

	
	public static void main(String[] args) {
		customer customer1=new customer(1,"Bhanesh");
		MainView mainViewObj=new MainView();
		
		int custId=mainViewObj.getcustomerIdfromcustomer(customer1);
		System.out.println("The customerId is : "+ custId);
		
		
		MainView customerName=new MainView();
		String custName=customerName.getcustomerNameCromCustId(custId);
		System.out.println("Customer Name is : "+custName);
	
	}

	
	
	
	
}
