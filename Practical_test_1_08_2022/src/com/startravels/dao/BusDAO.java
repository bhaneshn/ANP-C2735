package com.startravels.dao;

import com.startravels.model.Bus;
import com.startravels.model.BusRoute;

public class BusDAO {

	static Bus busArray[]=new Bus[100];
	public static boolean addBus(Bus bus) {
		boolean result=false;
		
		for(int i=0;i<busArray.length;i++) {
			if(busArray[i]==null) {
				busArray[i]=bus;
				result=true;
				break;
				
			}
			
		}
		return result;
		}
	
	static BusRoute busRouteArray[]=new BusRoute[100];
	public static boolean addBusRoute(BusRoute busRoute) {
		boolean result=false;
		for(int i=0;i<busRouteArray.length;i++) {
			if(busRouteArray!=null) {
				busRouteArray[i]=busRoute;
				result=true;
				break;
			}
			
		}
		return result;
	}
	public static Bus[] displayBus() {
		return busArray;
	}
	public static BusRoute[] displayBusRoute() {
		return busRouteArray;
	}
	public static Bus getBusByBusId(int busId) {
		// TODO Auto-generated method stub
		return Bus.getBusByBusId(busId);
	}
}
