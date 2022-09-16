package com.startravels.dao;

import com.startravels.model.Passengers;

public class PassengerDAO {

	static Passengers[] PassengerArray = new Passengers[100];

	public boolean addPassengerDetails1(Passengers passenger) {
			boolean result = false;
		
			for(int i=0; i<PassengerArray.length; i++) {
				if(PassengerArray[i]==null) {
					PassengerArray[i]=passenger;
					result = true;
					break;
				}
			}
			return result;
	}
	
	public static Passengers[] displayPassenger() {
		return PassengerArray;
	}

	
	
}
