package org.main;

import org.view.StudentView;

public class Main {

	public static void main(String[] args) {
		
		StudentView studentView=new StudentView();
		studentView.acceptStudentDetails();
		System.out.println();
		System.out.println("Student added sucessfully");
	}
}
