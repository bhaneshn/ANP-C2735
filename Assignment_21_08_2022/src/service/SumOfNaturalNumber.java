package service;

public class SumOfNaturalNumber {
	public int calculateSum(int n) {
		
		
		int sum=0;
		for(int i=1;i<=n;i++) {
			
			if(i%5==0 || i%3==0) 
				sum=sum+i;
			
		}
		   return sum;
		
		}
}
