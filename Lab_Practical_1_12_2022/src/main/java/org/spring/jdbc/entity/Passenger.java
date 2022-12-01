package org.spring.jdbc.entity;

public class Passenger {

	private int id;
	private int seatNo;
	private int age;
	private int ticketPrice;
	private String pname;
	
	public Passenger(int id, int seatNo, int age, int ticketPrice, String pname) {
		super();
		this.id = id;
		this.seatNo = seatNo;
		this.age = age;
		this.ticketPrice = ticketPrice;
		this.pname = pname;
	}

	public Passenger() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	
	
	
}
