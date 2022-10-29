package org.practice;

public class CheckPrimeIntervels {

	public static void main(String[] args) {
		
		int low=20;
		int high=40;
		
		while(low<high) {
			if(isPrimeIntervels(low)) {
				System.out.println(low);
			
			++low;
			}
		}
		}

		public static boolean isPrimeIntervels(int num) {
			
			boolean result=false;
			
			for(int i=2;i<=num/2;++i) {
				if(num%i==0) {
					result=true;
					break;
				}
			}
			return result;
		}
	}
