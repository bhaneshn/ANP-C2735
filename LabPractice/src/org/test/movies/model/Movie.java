package org.test.movies.model;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Movie Dtails :");
		
		System.out.print("Name : ");
		String name = sc.nextLine();
		
		System.out.print("Movie Start Time : ");
		String startTime = sc.nextLine();
		
		System.out.print("Movie End Time : ");
		String endTime = sc.nextLine();
		
		System.out.print("Movie Ticket Price : ");
		double price = sc.nextFloat();
		
		MovieTheatre movie = new MovieTheatre(name, startTime, endTime, price);
		
		System.out.println(movie);
	}


	

}
