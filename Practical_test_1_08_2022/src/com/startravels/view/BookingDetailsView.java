package com.startravels.view;

import java.util.Scanner;

import com.startravels.model.BookingDetails;
import com.startravels.model.Passengers;
import com.startravels.service.BookingDetailsService;

public class BookingDetailsView {

	Scanner sc = new Scanner(System.in);

	BookingDetailsService bookingDetailsService = new BookingDetailsService();
	
	public void addBookingDetailsService() {
		BookingDetails bookingDetails = new BookingDetails();
		Passengers passenger=new Passengers();
		System.out.println("Enter Booking Details :");
		
		System.out.println("Bus Id : ");
		bookingDetails.setBusId(sc.nextInt());
		
		System.out.println("Route Id : ");
		bookingDetails.setRouteId(sc.nextInt());
		sc.nextLine();
		System.out.println("Passenger Details : ");
		sc.nextLine();
		System.out.println("Passenger Name : ");
		passenger.setPassengerName(sc.nextLine());
		
		System.out.println("Mobile Number : ");
		passenger.setMobileNumber(sc.nextLong());
		
		System.out.println("Address : ");
		passenger.setAddress(sc.nextLine());		
		sc.nextLine();
		System.out.println("Gender : ");
		passenger.setGender(sc.nextLine());
		
		bookingDetails.setPassengerDetails1(passenger);;
		
		System.out.println("How many Seats wanted to book : ");
		int seats=sc.nextInt();
		sc.nextLine();
		bookingDetails.setTicketCharges(seats*10);
		BookingDetailsService.addBookingDetailsDetails(bookingDetails,seats);
		
	}

	public BookingDetails[] displayBookingDetails() {
		
		return bookingDetailsService.displayBookingDetails();
	}
}
