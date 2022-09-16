package com.startravels.service;

import com.startravels.dao.BookingDetailsDAO;
import com.startravels.model.BookingDetails;
import com.startravels.model.Bus;

public class BookingDetailsService {

private static  BookingDetailsDAO bookingDetailsDAO = new BookingDetailsDAO();
	
	BusService busService=new BusService();
	public static boolean addBookingDetailsDetails(BookingDetails bookingDetails ,int seats) {
		System.out.println(" Booking Details : "+bookingDetails);
		Bus bus=BusService.getBusByBusId(bookingDetails.getBusId());
		bus.setNumberOfseats(bus.getNumberOfseats()-seats);
		BusService.addBus(bus);
		if(bus.getNumberOfseats()!=0) {
			bookingDetailsDAO.addBookingDetails(bookingDetails);
		}else 
		{
			System.out.println("Bus Is full");
		}
		return true;
	}
	
	public BookingDetails[] displayBookingDetails() {
		return BookingDetailsDAO.displayBookingDetails();
	}
}
