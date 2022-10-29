package org.practice;

public class AverageArrays {

	public static void main(String[] args) {
	
		int sum=0;
		int arrayElements[]= {2,3,4,5,6,7,8,10};
		
		for(int num:arrayElements) {
			sum+=num;
		}
		
//		int totalElements=arrayElements.length;
//		int average=sum/totalElements;
		
		int average=sum/arrayElements.length;
		System.out.println("the Average of array Elements is : "+average);

	}

}
