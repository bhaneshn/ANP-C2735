package org.practicaltest.question5.main;

import org.practicaltest.question2.view.DepartmentView;
import org.practicaltest.question2.view.EmployeeView;

public class Main {

	public static void main(String[] args) {
		EmployeeView empView=new EmployeeView();
		DepartmentView depView=new DepartmentView();
		
		empView.acceptEmployeeDetails();
		System.out.println();
		System.out.println("Employee Added Successully");
		depView.acceptDepartmentDetails();
		System.out.println();
		System.out.println("Department Added Successully");
		
		
	}
}
