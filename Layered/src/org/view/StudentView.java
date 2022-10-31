package org.view;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;

import org.exception.StudentValidateException;
import org.model.Gender;
import org.model.Student;
import org.service.StudentService;

public class StudentView {

	static StudentService studentService=new StudentService();
	static Scanner sc=new Scanner(System.in);
	static int studentIDcount=1;
	public boolean validateGender(String genderUpperCase) {
		boolean result=false;
		System.out.println(genderUpperCase);
		for(Gender genderLocal:Gender.values()) {
			System.out.println(genderLocal);
			if(genderUpperCase.equals(genderLocal.toString())) {
				result=true;
				break;
			}
		}
		return result;
	}
	public void acceptStudentDetails() {
		int input;
		do {
		Gender gender;
		System.out.println("Add Student Details");
		System.out.println("Enter Student Id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name");
		String name=sc.nextLine();
		System.out.println("Enter student Date of Birth in pattern like (yyyy-mm-dd) ");
		String studentDOB=sc.nextLine();
		LocalDate dob=LocalDate.parse(studentDOB);
		System.out.println(dob);
		System.out.println("Enter Student Gender");
		String genderString=sc.nextLine();
		String genderUpperCase=genderString.toUpperCase();
		if(!validateGender(genderUpperCase)) 
			throw new StudentValidateException("Give an appropriate gender");
		
		else 
			gender=Gender.valueOf(genderUpperCase);
		Student student=new Student(studentIDcount,id,name,gender,dob);
			studentService.addStudentDetails(student);
			System.out.println("Add 1 More Student");
			input=sc.nextInt();
		}while(input==1);
	}

	public HashSet<Student> getStudentDetails(){
		return studentService.getStudentDetails();
	}
}
