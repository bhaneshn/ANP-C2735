package org.practice;

public class CheckEqualsInString {

	public static void main(String[] args) {
		
		String str1="Java";
		String str2="Java";
		String str3="Python";
		
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str2==str3);
		
		System.out.println();
		
		String str4=new String("Java");
		String str5=new String("Java");
		String str6=new String("Python");
		System.out.println(str4==str5);
		System.out.println(str4.equals(str5));
		System.out.println(str4.equals(str6));
	}

}
