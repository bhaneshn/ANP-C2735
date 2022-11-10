package org.practice;

import java.util.Arrays;

public class SwapInArray {

	public static void main(String[] args) {
		
		int[] arr= {5,10,15,20};
		swap(arr, 0, 3);// this 0 and 3 are index numbers for swaping by method

		System.out.println(Arrays.toString(arr));
		// it will swap the values like {20,10,15,5}
	}
	

	static void swap(int[] arr,int index1,int index2) {
		
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}
}
