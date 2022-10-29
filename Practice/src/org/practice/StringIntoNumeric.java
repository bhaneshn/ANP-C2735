package org.practice;

public class StringIntoNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="150.78";
		boolean numeric=true;
		
		try {
			Double num=Double.parseDouble(str);
		}catch(NumberFormatException e) {
			numeric=false;
		}
		if(numeric) {
			System.out.println("Value is Converted. "+str+" is numeric value");
		}
		else {
			System.out.println("Value is not coverted. "+str+" is non numeric value");
		}
	}

}
