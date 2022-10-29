package org.practice;

import java.util.Scanner;

public class PerfectSquare {

	public static boolean isPefectSquare(double number) {
		
		double root=Math.sqrt(number);
		
		return(root - Math.floor(root)==0);
	}
	public static void main(String[] args) {
		int input=0;
		do {
		double number=0.0;
		boolean result=false;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a square");
		number=scan.nextDouble();
		result=isPefectSquare(number);
		
		if(result) {
			System.out.println("Perfect Square");
		}
		else {
			System.out.println("Not perfect square");
		}
	
		}while(true);
		
	}
		
}
