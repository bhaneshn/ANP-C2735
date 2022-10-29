package org.practice;

public class ReversedNumber {

	public static void main(String[] args) {
		int num=78;
		int reversed=0;
		while(num!=0) {
			int rem=num%10;
			reversed=reversed*10+rem;
			num/=10;
		}
		System.out.println("Reversed Number is "+reversed);
	}
}
