package org.practicaltest.question2.view;

import java.util.HashSet;
import java.util.Scanner;

import org.practicaltest.question1.model.Department;
import org.practicaltest.question1.model.Departments;
import org.practicaltest.question1.model.Employee;
import org.practicaltest.question4.service.DepartmentService;

public class DepartmentView {

	static Scanner scan=new Scanner(System.in);
	static Department department=new Department();
	static DepartmentService departmentService=new DepartmentService();
	
	public static void acceptDepartmentDetails() {
		System.out.println(" Enter Department Id");
		int department=scan.nextInt();
		scan.nextLine();
		System.out.println(" Enter Account Department ");
		String account=scan.nextLine();
		System.out.println(" Enter Purchase Department ");
		String purchase=scan.nextLine();
		
		Department department1=new Department(department,Departments.valueOf(account),Departments.valueOf(purchase));
		departmentService.addDepartment(department1);
	}
	public HashSet<Department> getEmployeeDetails(){
		return departmentService.getDepartmentDetails();
	}
}
