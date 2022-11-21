package org.practice;

import java.util.Scanner;

public class B {
	
		public static void main(String[] args) {
		    
		    Double r,perimeter_of_O,Area_of_O;
		    
		       Scanner sc=new Scanner(System.in);
		       System.out.println("Enter radius for Area_of_O");
		       r=sc.nextDouble();
		       
		       perimeter_of_O=2*r*(22/7);
			    Area_of_O=(22/7)*r*r;
		       
		       System.out.println(perimeter_of_O);
		       System.out.println(Area_of_O);
		       
		}
	
}
