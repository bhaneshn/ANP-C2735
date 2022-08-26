package question1.org.service;

public class ArrayService {

	public static  int calculateAverage(int[]array) {
	
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		return sum/array.length;
		
	}
	
}
