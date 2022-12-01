package org.spring.jdbc.dao;

import org.spring.jdbc.entity.Passenger;

public interface PassengerDAO {

	public int savePassenger(Passenger pass);
	
	public int updatePassenger(Passenger pass);
	
	public int deletePassenger(Passenger pass);
	
}
