package com.startravels.view;

import java.util.Scanner;

import com.startravels.model.Bus;
import com.startravels.model.BusRoute;
import com.startravels.model.BusType;
import com.startravels.service.BusService;

public class BusView {

	static Scanner scan=new Scanner(System.in);
	public static boolean addBus() {
		System.out.println(" Add Bus");
		System.out.println("Enter bus Id");
		int busId=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter BusRegistrationNo.");
		int busRegistrationNo=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter BusType");
		String sleeperCouch=scan.nextLine();
		System.out.println("Enter Seat Number");
		int seatNumber=scan.nextInt();
		scan.nextLine();
		
		Bus bus=new Bus(busId,busRegistrationNo,BusType.valueOf(sleeperCouch),seatNumber);
		BusService.addBus(bus);
		return true;
	}
	
	static Scanner scanner=new Scanner(System.in);
	public static boolean addBusRoute() {
		System.out.println("Add BusRoute ");
		System.out.println("Enter BusId");
		int busId=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Bus RouteId");
		int busRouteId=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Bus Source City");
		String busSourceCity=scanner.nextLine();
		System.out.println("Enter Bus Destination City");
		String busDestinationCity=scanner.nextLine();
		
		BusRoute busRoute=new BusRoute(busId,busRouteId,busSourceCity,busDestinationCity);
		BusService.addBusRoute(busRoute);
		return true;
	}
	
	public static Bus[] displayBus() {
		return BusService.displayBus();
	}
	
	public static BusRoute[] displayBusRoute() {
		return BusService.displayBusRoute();
	}
}
