package org.practicaltest.question3.main;




import org.practicaltest.question2.view.StudentView;

public class Main {

	public static void main(String[] args) {
		
		StudentView studentView=new StudentView();
		
		studentView.acceptStudentData();
		System.out.println();
		
		System.out.println("All student Added Sucessfully");

	}
}
