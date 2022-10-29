package org.practice;

public class FindLargestNumberInArray {

	public static void main(String[] args) {
		
		int array[]= {25,55,65,48,23,-45,-65};	
		
		int largest=array[0];
		
		for(int num:array) {
			if(largest<num) {
				largest=num;
			}
		}
		System.out.println(" The largest Number in array is : "+largest);
		
		}
		

}
