package com.startravels.service;

import com.startravels.dao.BusDAO;
import com.startravels.model.Bus;
import com.startravels.model.BusRoute;

public class BusService {

	public static boolean addBus(Bus bus) {
		boolean result = false;
		BusDAO.addBus(bus);
		return result;
	}
	
	public static boolean addBusRoute(BusRoute busRoute) {
		boolean result=false;
		BusDAO.addBusRoute(busRoute);
		return result;
		
	}
	public static Bus[] displayBus() {
		return BusDAO.displayBus();
	}
	
	public static BusRoute[] displayBusRoute() {
		return BusDAO.displayBusRoute();
	}

	public static Bus getBusByBusId(int busId) {
		// TODO Auto-generated method stub
		return BusDAO.getBusByBusId(busId);
	}

	
}
