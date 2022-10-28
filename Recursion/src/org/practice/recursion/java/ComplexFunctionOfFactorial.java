package org.practice.recursion.java;

public class ComplexFunctionOfFactorial {

	public static int calculateFactorial(int n) {
		
		if(n==1) {
			return 1;
		}
		else {
			return (n*calculateFactorial(n-1));
		}
		
		
	}
	
}
