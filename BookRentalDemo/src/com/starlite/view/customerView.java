package com.starlite.view;

import java.util.Scanner;

import com.starlite.dao.CustomerDAO;
import com.starlite.model.CustomerDetails;
import com.starlite.service.customerService;

public class customerView {

	static Scanner scanner=new Scanner(System.in);
	public static boolean addCustomerDetails() {
		System.out.println("Customer Details");
		System.out.println("Enter Customer Id");
		int customerId=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Customer Name");
		String customerName=scanner.nextLine();
		
		System.out.println("Enter Customer Contact");
		int customerContact=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Customer Address");
		String customerAddress=scanner.nextLine();
		
		
		
	CustomerDetails cust = new CustomerDetails(customerId,customerName,customerContact,customerAddress) ;
		customerService.addCustomerDetails(cust);
		return true;
	}
	public static CustomerDetails[] displayCustomerDetails() {
		return customerService.displayCustomerDetails();
	}
}
