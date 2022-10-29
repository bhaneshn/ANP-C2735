package org.practice;

public class ReverseCaseUsingArray {

	public static void main(String[] args) {
		
		String string="JaVa is FuN";
		boolean isLower;
		
		char strArray[]=string.toCharArray();
		
		for(int i=0;i<strArray.length;++i) {
			
			char ch=strArray[i];
			
			isLower=ch>='a' && ch<='z';// this is used for checking whether this check the char 
			
			String value=String.valueOf(ch);
			
			if(isLower) {
				strArray[i]=value.toUpperCase().charAt(0);
			}
				else {
					strArray[i]=value.toLowerCase().charAt(0);
				}
			}
		System.out.println("The reverse case of String is : " + String.valueOf(strArray));
		}
}
