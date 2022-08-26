package org.example.view;
import org.example.model.customer;

public class MainView {
	
	int getcustomerIdfromcustomer(customer custObj) {  //here accept customer obj/ and make a method
		int custId=custObj.getCustomerId();  // calling method
		return custId;
	
	
	}
	String getcustomerNameFromCustName(String Obj) { // here accept customer Id
		 return Obj; //print customer name inside the method function
		
	}

	
	public static void main(String[] args) {
		customer customer1=new customer(1,"Bhanesh");
		MainView mainViewObj=new MainView();
		
		int custId1=mainViewObj.getcustomerIdfromcustomer(customer1); //this customer1 from customer custObj
		System.out.println("The customerId is : "+ custId1);
		
		
		MainView customerName=new MainView();
		String custName=customerName.getcustomerNameFromCustName("Bhanesh");
		System.out.println("Customer Name is : "+custName);
	
	}

	
	
	
	
}
