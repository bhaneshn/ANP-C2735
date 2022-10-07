package org.practicaltest.question3.dao;

import java.util.HashMap;

import org.practicaltest.question1.model.Department;
import org.practicaltest.question1.model.Employee;

public class EmployeeDepartmentDAO {

	static Employee emp= new Employee();
	public void addEmployeeDepartment(Employee emp,Department dep) {
		
		HashMap<Employee,Department> hashMap=new HashMap<Employee,Department> ();
	hashMap.put(emp,dep);
	System.out.println(hashMap);
	
	}
	
}
