package org.practice;

public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String message="everyone loves java";
		
		String strArray[]=message.split(" ");
		for(int i=0;i<strArray.length;++i) {
		
		String str=strArray[i];
		
		String firstLetter=str.substring(0,1);
		
		String remainingLetter=str.substring(1,str.length());
		
		firstLetter=firstLetter.toUpperCase();
		str=firstLetter+remainingLetter;
		strArray[i]=str;
		}
		
		String newMessage="";
		for(String element:strArray) {
			newMessage=newMessage+element+" ";
		}
		System.out.println(newMessage);
		}
	

}
