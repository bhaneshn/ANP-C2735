package service;

public class SquareDifference {
	
	public int calculateDifference(int n) {
		
		
		int sum1=0;
		int sum2=0;
		for(int i=1;i<n;i++) 
		{
		sum1=sum1 +i*i;
		}
		for(int i=1;i<n;i++) {
			
		sum2=sum2+i;
		Math.pow(sum2+i,2);
		
		}
		return sum1-sum2;
		 
	}
}





	

