package org.practicaltest.question2.view;

import java.util.Scanner;

import org.practicaltest.question1.model.Student;
import org.practicaltest.question3.service.StudentService;

public class StudentView {

	static Scanner scanner=new Scanner(System.in);
	
	public void acceptStudentData() {
		System.out.println("Enter 10 Student Details"); 
		for(int i=0;i<10;i++) { 
		System.out.println("Add Student");
		System.out.println("Enter Student Details");
		System.out.println();
		System.out.println("Enter Student Id");
		int id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Student Name");
		String name=scanner.nextLine();
		
		System.out.println(StudentService.addStudent(new Student(id,name)));
		}
	}
	
}
