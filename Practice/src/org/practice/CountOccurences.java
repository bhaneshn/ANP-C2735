package org.practice;

import java.util.Scanner;

public class CountOccurences {

	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int rem=0;
	int count=0;
	while(n>0) {
		rem=n%10;
		if(rem==5) {
			count++;
		}
		
		n=n/10;
	}

	System.out.println(count);
	}

}
