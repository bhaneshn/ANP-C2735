package com.startravels.model;

public class Passengers {
	private String passengerName;
	private long mobileNumber;
	private String address;
	private String gender;
	public Passengers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passengers(String passengerName, long mobileNumber, String address, String gender) {
		super();
		this.passengerName = passengerName;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Passengers [passengerName=" + passengerName + ", mobileNumber=" + mobileNumber + ", address=" + address
				+ ", gender=" + gender + "]";
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
