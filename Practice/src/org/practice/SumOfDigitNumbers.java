package org.practice;

import java.util.Scanner;

public class SumOfDigitNumbers {

	public static int digitSum(int number) {
		
//		here we declares the variables
		int sum=0;
		int lastDigit=0;
		
//		here we use the loop for repeat the process
		while(number!=0) {
			
//			find the last digit of number
			lastDigit=number%10;
			
//			here we add lastDigit to the sum
			sum=sum+lastDigit;
			
//			and after that we remove last digit
			number=number/10;
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int number=0,sumofDigits=0;
		
		Scanner scanner=new Scanner(System.in);
		
//		read input
		System.out.println("Enter  numbers for sum of value : ");
		number=scanner.nextInt();
		
		sumofDigits=digitSum(number);
		
		System.out.println("--> Sum of digits of the "+number+" is "+sumofDigits);
		
		
		scanner.close();
	}

}
