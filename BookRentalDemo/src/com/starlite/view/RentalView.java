package com.starlite.view;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.starlite.model.Book;
import com.starlite.model.RentalDetails;
import com.starlite.service.BookService;
import com.starlite.service.RentalService;

public class RentalView {

	static Scanner scan=new Scanner(System.in);
	public static boolean calculateRentalPrice() {
	System.out.println("Add Calulated rental price");
	System.out.println("Issiue date");
	String returnDate=scan.nextLine();
	LocalDate localDate=LocalDate.parse(returnDate);
	scan.nextLine();
	String issueDate=scan.nextLine();
	LocalDate localDate1=LocalDate.now();
	
	System.out.println(localDate1);
	DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/mm/yyyy");
	LocalDate localDate2=LocalDate.parse(issueDate,format);
	System.out.println(localDate);
	System.out.println(localDate2);
	System.out.println("Enter Rental Price");
	double rentPrice=scan.nextDouble();
	scan.nextLine();
	
	RentalDetails rent=new RentalDetails(localDate,rentPrice);
	RentalService.calculateRentalPrice(rent);
	return true;
	
	}
	public static RentalDetails[] displayRentalPrice() {
		return RentalService.displayRentalPrice();
	}
	
}
