package com.startravels.dao;

import com.startravels.model.BookingDetails;

public class BookingDetailsDAO {
	static BookingDetails bookingDetailsArray[] = new BookingDetails[100];

	public boolean addBookingDetails(BookingDetails bookingDetails) {
			boolean result = false;
			System.out.println("BookingDetailsDAO : "+ bookingDetails);
			for(int i=0; i<bookingDetailsArray.length; i++) {
				if(bookingDetailsArray[i]==null) {
					bookingDetailsArray[i]=bookingDetails;
					result = true;
					break;
				}
			}
			return result;
	}
	
	public static BookingDetails[] displayBookingDetails() {
		return bookingDetailsArray;
	}
}
