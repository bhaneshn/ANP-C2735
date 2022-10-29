package org.practice;

public class RandomString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String random="";
		
//		Specify length of random String
		
		int size=10;
		int alphabetLength=alphabet.length();
		
//		iterate for loop for size
		
		for(int i=0;i<=size;i++) {
			int index=(int)(Math.random()*alphabetLength-1);
			char randomChar=alphabet.charAt(index);
			random=random+randomChar;
		}
		System.out.println("The String of Random Character is : -->> "+random);
	}

}
