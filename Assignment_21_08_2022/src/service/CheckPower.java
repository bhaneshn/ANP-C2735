package service;

public class CheckPower {

	public static boolean checkNumber(int n) {
		
//		if((n&(n-1))==0) 
			
		
		if (n<2) {
			return false;
		}
		while(n%2==0) {
			n/=2;
		}
		return n==1;
	}
	
}
