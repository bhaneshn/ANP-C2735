package com.anudip.hibernate;

import java.util.Scanner;

import com.anudip.hbce.daoimle.CustomerDAOImpl;
import com.anudip.hbce.entity.Customer;


public class App 
{
    public static void main( String[] args )
    
    {
    	Scanner scan=new Scanner(System.in);
    	CustomerDAOImpl custDAO=new CustomerDAOImpl();
    	
    	char a;
    	do {
    		System.out.println("Welcome to the Application");  
    		System.out.println("1: Read");
    		System.out.println("2: Add");
    		System.out.println("3: update");
    		System.out.println("4: delete");
    		System.out.println("5: exit");
    		
    		int ch=scan.nextInt();
    		switch (ch) {
			case 1:
				custDAO.getCustomer();
				break;
			case 2:
				custDAO.addCustomer();
				break;
			case 3:
				custDAO.updateCustomer();
				break;
			case 4:
				custDAO.deleteCustomer();
				break;
			case 5:
				System.out.println("Thank you");
				System.exit(0);
				
			default:
				System.out.println("Something went wrong");
				break;
			}
    		System.out.println("do you want to want another press Y / N");
    		a=scan.next().charAt(0);
    	}while(a=='Y'|| a=='y');
    
    	System.out.println("Thank you");
       
       
    }
}
