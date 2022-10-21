package org.test.main;

import org.test.model.Customer;

public class Main {

	public static void main(String[] args) {
	
		Customer customer1=new Customer();
		Customer customer2=new Customer();
		customer1.createAccount(5456, "Bhanesh", 500);
		customer1.getAmount();
		customer1.setAmount(2000);
		customer1.withDrawnAmount();
		
		System.out.println();
		
		customer2.createAccount(8760, "Harshal",5000);
		customer2.getAmount();
		customer2.setAmount(1000);
	


	}

}
