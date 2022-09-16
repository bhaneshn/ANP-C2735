package com.startravels.service;

import com.startravels.dao.PassengerDAO;
import com.startravels.model.Passengers;

public class PassengerService {

private PassengerDAO passengerDAO = new PassengerDAO();
	
	
	public boolean  addPassengerDetails(Passengers passenger) {
		return passengerDAO.addPassengerDetails1(passenger);
	}
	
	public Passengers[] displayPassenger() {
		return PassengerDAO.displayPassenger();
	}



}
