package com.startravels.model;

import com.startravels.service.BusService;

public class Bus {

	private int busId;
	private int busRegistrationNo;
	private  BusType sleeperCouch;
	private int numberOfseats;
	
	public Bus() {
		
		
	}
	
	public Bus(int busId, int busRegistrationNo, BusType sleeperCouch, int numberOfseats) {
		super();
		this.busId = busId;
		this.busRegistrationNo = busRegistrationNo;
		this.sleeperCouch = sleeperCouch;
		this.numberOfseats = numberOfseats;
	}

	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busRegistrationNo=" + busRegistrationNo + ", sleeperCouch=" + sleeperCouch
				+ ", numberOfseats=" + numberOfseats + "]";
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public int getBusRegistrationNo() {
		return busRegistrationNo;
	}

	public void setBusRegistrationNo(int busRegistrationNo) {
		this.busRegistrationNo = busRegistrationNo;
	}

	public BusType getSleeperCouch() {
		return sleeperCouch;
	}

	public void setSleeperCouch(BusType sleeperCouch) {
		this.sleeperCouch = sleeperCouch;
	}

	public int getNumberOfseats() {
		return numberOfseats;
	}

	public void setNumberOfseats(int numberOfseats) {
		this.numberOfseats = numberOfseats;
	}

	public static Bus getBusByBusId(int busId2) {
		// TODO Auto-generated method stub
		return BusService.getBusByBusId(busId2);
	}

	
	
	
	
}
