package com.startravels.main;

import java.util.Scanner;

import com.startravels.model.BookingDetails;
import com.startravels.model.Bus;
import com.startravels.model.BusRoute;
//import com.startravels.model.Passenger;
import com.startravels.model.Passengers;
//import com.startravels.model.Passengers;
import com.startravels.view.BookingDetailsView;
import com.startravels.view.BusView;
import com.startravels.view.PassengerView;

public class Main {
	static BookingDetailsView bookingView=new BookingDetailsView();
	static PassengerView passengerView=new PassengerView();
	static Scanner scanner = new Scanner(System.in);
	static void displayMenu() {
		System.out.println("1.Add  bus Details");
		System.out.println("2.Display Bus Details");
		System.out.println("3.Add  busRoute Details");
		System.out.println("4.Display BusRoute Details");
		System.out.println("5 : Book bus  ");
		System.out.println("6 : Display Booking Details ");
		System.out.println("7 : Add Passenger Details ");
		System.out.println("8 : Display Passenger Details ");
		System.out.println("9: Exit");
		System.out.println("Enter your Choice");
		int subMenuChoice=scanner.nextInt();
		
		scanner.nextLine();
		switch(subMenuChoice) {
		case 1:
			if(BusView.addBus())
				System.out.println("Bus added Successfully.");
				break;
		case 2:
				Bus bus[]=BusView.displayBus();
				for(Bus bus1:bus) {
					if(bus1!=null)
					System.out.println(bus1);
					else
				
				break;
				}
		case 3:
			if(BusView.addBusRoute())
				System.out.println("BusRoute Added Successfully");
			break;
		
		case 4:
			BusRoute busRoute[]=BusView.displayBusRoute();
			for(BusRoute bus2:busRoute) {
				if(bus2!=null)
					System.out.println(bus2);
				else
					break;
				
			}
			
		case 5:
			bookingView.addBookingDetailsService();
			System.out.println(" Book Sucessfully || ");
			System.out.println();
			
		break;
		case 6:
			BookingDetails bookingDetails[]=bookingView.displayBookingDetails();
			for(BookingDetails localbookingDetails : bookingDetails) {
				if(localbookingDetails != null) {
					System.out.println(localbookingDetails);
				}
				else 
					break;
				
			}
			break;
		
		case 7:
			passengerView.addPassengerDetails();
				System.out.println(" ||  Added Sucessfully || ");
				
			System.out.println();
			break;
			
		case 8:
			Passengers[] passenger=passengerView.displayPassengerDetails();
			for(Passengers localPassenger : passenger) {
				if(localPassenger != null) {
					System.out.println(localPassenger);
				}
				else {
					break;
				}
			}
			break;
		case 9:
			System.exit(0);
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
				displayMenu();
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
