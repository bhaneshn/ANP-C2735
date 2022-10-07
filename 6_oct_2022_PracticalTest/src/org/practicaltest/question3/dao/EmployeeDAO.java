package org.practicaltest.question3.dao;

import java.util.HashSet;

import org.practicaltest.question1.model.Employee;



public class EmployeeDAO {

	static HashSet<Employee> hashSet=new HashSet<Employee>();
	
	public static void addEmployee(Employee employee) {
		hashSet.add(employee);
		System.out.println(hashSet);
	}
	
	public HashSet<Employee> getEmployeeDetails(){
		return hashSet;
	}
}
