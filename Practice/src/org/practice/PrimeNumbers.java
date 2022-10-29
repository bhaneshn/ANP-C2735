package org.practice;

public class PrimeNumbers {

	// A number which is divisible by 1 or itself this is called Prime Numbers
	
	public static void main(String[] args) {
		int num=13;
		boolean flag=false;
		
		for(int i=1;i<=num;++i) {
			if(num%2==0) {
				flag=true;
				break;
			}
		}
			if(!flag) {
				System.out.println(num+" is a Prime Number");
			}
			else {
				System.out.println(num+" is is not Prime Number");
			}
		}


}
