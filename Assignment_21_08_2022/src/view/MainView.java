package view;

import service.SumOfNaturalNumber;

public class MainView {
	public static void main(String[]args) {
		
		SumOfNaturalNumber nNuObj=new SumOfNaturalNumber ();
		
		System.out.println(nNuObj.calculateSum(5));
		
		}
	
}
