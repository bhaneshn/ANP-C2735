package com.startravels.model;

public class BusRoute {

	private int busId;
	private int busRouteId;
	private String busSourceCity;
	private String busDestinationCity;
	public BusRoute() {
		
	}
	public BusRoute(int busId, int busRouteId, String busSourceCity, String busDestinationCity) {
		super();
		this.busId = busId;
		this.busRouteId = busRouteId;
		this.busSourceCity = busSourceCity;
		this.busDestinationCity = busDestinationCity;
	}
	@Override
	public String toString() {
		return "BusRoute [busId=" + busId + ", busRouteId=" + busRouteId + ", busSourceCity=" + busSourceCity
				+ ", busDestinationCity=" + busDestinationCity + "]";
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public int getBusRouteId() {
		return busRouteId;
	}
	public void setBusRouteId(int busRouteId) {
		this.busRouteId = busRouteId;
	}
	public String getBusSourceCity() {
		return busSourceCity;
	}
	public void setBusSourceCity(String busSourceCity) {
		this.busSourceCity = busSourceCity;
	}
	public String getBusDestinationCity() {
		return busDestinationCity;
	}
	public void setBusDestinationCity(String busDestinationCity) {
		this.busDestinationCity = busDestinationCity;
	}
	
	
}
