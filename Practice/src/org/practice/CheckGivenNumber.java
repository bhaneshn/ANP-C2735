package org.practice;

public class CheckGivenNumber {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7};
		boolean found = false;
		int value=3;
		for(int elements:array) {
			if(elements==value) {
			found=true;
			break;
			}
			
		
		}
		if(found) {
			System.out.println(value+" is  given in the Array");
		}
		else {
			System.out.println(value+" is not given in the Array");
		}
	}

}
