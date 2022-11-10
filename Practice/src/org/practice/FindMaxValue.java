package org.practice;

public class FindMaxValue {

	public static void main(String[] args) {
		
		int []arr= {1,3,34,70,9,14};
		
		System.out.println(max(arr));
	}
	
	static int max(int[]arr) {
		
		
		int maxValue=arr[0];//  we take a input over here
		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>maxValue) {
				maxValue=arr[i];
			}
			
		}
		return maxValue;
	}
}
