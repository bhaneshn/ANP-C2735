package com.startravels.view;

import java.util.Scanner;

import com.startravels.model.Passengers;
import com.startravels.service.PassengerService;

public class PassengerView {

Scanner sc = new Scanner(System.in);
	
	PassengerService passengerService = new PassengerService();
	
	public void addPassengerDetails() {
		
		Passengers passenger=new Passengers();
		
		System.out.println("Enter Passenger Details :");
		
		System.out.println("Passenger Name : ");
		passenger.setPassengerName(sc.nextLine());
		
		System.out.println("Mobile Number : ");
		passenger.setMobileNumber(sc.nextLong());
		sc.nextLine();
		System.out.println("Address : ");
		passenger.setAddress(sc.nextLine());		
		
		System.out.println("Gender : ");
		passenger.setGender(sc.nextLine());
	
		
		passengerService.addPassengerDetails(passenger);
	}

	public Passengers[] displayPassengerDetails() {
		// TODO Auto-generated method stub
		return passengerService.displayPassenger();
	}
}
