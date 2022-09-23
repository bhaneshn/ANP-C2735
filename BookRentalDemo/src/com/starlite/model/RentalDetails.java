package com.starlite.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class RentalDetails {
	
private LocalDate localDate;
private double rentPrice;

public RentalDetails() {
	
}
public RentalDetails(LocalDate localDate,  double rentPrice) {
	super();
	this.localDate = localDate;
	
	this.rentPrice = rentPrice;
}
public LocalDate getLocalDate() {
	return localDate;
}
public void setLocalDate(LocalDate localDate) {
	this.localDate = localDate;
}

public double getRentPrice() {
	return rentPrice;
}
public void setRentPrice(double rentPrice) {
	this.rentPrice = rentPrice;
}

@Override
public String toString() {
	return "RentalDetails [localDate=" + localDate + ", rentPrice=" + rentPrice + "]";
}
public static RentalDetails[] displayRentalPrice() {
	// TODO Auto-generated method stub
	return null;
}
	
	
}
