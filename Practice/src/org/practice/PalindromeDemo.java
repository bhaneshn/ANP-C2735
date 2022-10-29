package org.practice;

public class PalindromeDemo {

	public static void main(String[] args) {
	int num=3443,reverseNumber=0;
	int originalNumber=num;
	while(num!=0) {
		int rem=num%10;
		reverseNumber=reverseNumber*10+rem;
		num/=10;
		
	}
	if(originalNumber==reverseNumber) {
		System.out.println(originalNumber+" is Palindrome Number");
	}
	else {
		System.out.println(originalNumber+" is Not a Palindrome Number");
	}

	}

}
