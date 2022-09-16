package com.startravels.model;

public class BookingDetails {
	private int busId;
	private int routeId;
	private Passenger passengerDetails;
	private float ticketCharges;
	public BookingDetails() {
		super();
		
	}
	
	
	public BookingDetails(int busId, int routeId, Passenger passengerDetails, float ticketCharges) {
		super();
		this.busId = busId;
		this.routeId = routeId;
		this.passengerDetails = passengerDetails;
		this.ticketCharges = ticketCharges;
	}

	
	
	@Override
	public String toString() {
		return "BookingDetails [busId=" + busId + ", routeId=" + routeId + ", passengerDetails=" + passengerDetails
				+ ", ticketCharges=" + ticketCharges + "]";
	}


	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public Passenger getPassengerDetails() {
		return passengerDetails;
	}
	public void setPassengerDetails(Passenger passengerDetails) {
		this.passengerDetails = passengerDetails;
	}
	public float getTicketCharges() {
		return ticketCharges;
	}
	public void setTicketCharges(float ticketCharges) {
		this.ticketCharges = ticketCharges;
	}


	public void setPassengerDetails1(Passengers passenger) {
		// TODO Auto-generated method stub
		
	}
	
}
