package view;

import pack1.Base;
import pack2.Sub;

public class Main {
	public static void main(String[] args) {
		Sub subObj=new Sub();//invoke by direct calling the method 
		Base baseObj=new Base();
		subObj.display1();
		
		//baseObj.display();
		subObj.print();
		Base Obj=new Sub();
		//Obj.display();
		
		
		
		
		
	}
}
