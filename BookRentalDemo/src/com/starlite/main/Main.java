package com.starlite.main;
import java.util.Scanner;

import com.starlite.model.Book;
import com.starlite.model.CustomerDetails;
import com.starlite.model.RentalDetails;
import com.starlite.view.BookView;
import com.starlite.view.RentalView;
import com.starlite.view.customerView;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static void displaySubMenu() {
		System.out.println("1.Add  book");
		System.out.println("2.Display All Book");
		System.out.println("3.Add Customer Details ");
		System.out.println("4.Display All Customer Details");
		System.out.println("5.Add caluculated Rental Details");
		System.out.println("6.Display All Rental Details");
		
		System.out.println("Enter your Choice");
		int subMenuChoice=scanner.nextInt();
		scanner.nextLine();
		switch(subMenuChoice) {
		case 1:
			if(BookView.addBook())
			System.out.println("Book Added Successfully.");
			break;
		case 2:
			Book book[]=BookView.displayBooks();
//			for(Book localBook:book) {
//				if(localBook!=null)
				System.out.println(book);
				
				
			case 3:
				if(customerView.addCustomerDetails())
					System.out.println("Customer Details Added SuccessFully..");
				break;
			case 4:
				CustomerDetails cust[]= customerView.displayCustomerDetails();
//				for(CustomerDetails custDetails:cust) {
//					if(custDetails!=null)
						System.out.println(cust);
					
			case 5:
				if(RentalView.calculateRentalPrice())
					System.out.println("Rental Details Added SuccessFully..");
				break;
			case 6:
				RentalDetails rent[]=RentalDetails.displayRentalPrice();
				for(RentalDetails rentDetails:rent)
					if(rentDetails!=null)
					System.out.println(rentDetails);
					else
						break;
						
			break;
			default:
			System.out.println("Not a Valid Input");
			
		}
	
	}

	public static void main(String[] args) {
		int choice;
		do {
			
			System.out.println("1. Start Application");
			System.out.println("2. Stop Application");
			System.out.println("Enter your choice");
			choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:
				displaySubMenu();
				break;
			case 2:
				System.exit(0);
				break;
			default:
				System.out.println("Not a valid choice ....");
			}
			
			
		}while(true);

	}

}
