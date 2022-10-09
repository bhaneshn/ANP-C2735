package org.practicaltest.view;

import java.util.HashSet;
import java.util.Scanner;

import org.practicaltest.model.Department;
import org.practicaltest.model.Departments;
import org.practicaltest.model.Employee;
import org.practicaltest.service.DepartmentService;

public class DepartmentView {

	static Scanner scan=new Scanner(System.in);
	static Department department=new Department();
	static DepartmentService departmentService=new DepartmentService();
	
	public static void acceptDepartmentDetails() {
		System.out.println(" Enter Department Id");
		int department=scan.nextInt();
		scan.nextLine();
		System.out.println(" Enter Department Name ");
		String departmentName=scan.nextLine();
		
		
		Department department1=new Department(department,Departments.valueOf(departmentName));
		departmentService.addDepartment(department1);
	}
	public HashSet<Department> getEmployeeDetails(){
		return departmentService.getDepartmentDetails();
	}
}
