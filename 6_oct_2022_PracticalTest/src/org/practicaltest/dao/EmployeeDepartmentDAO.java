package org.practicaltest.dao;

import java.util.HashMap;

import org.practicaltest.model.Department;
import org.practicaltest.model.Employee;

public class EmployeeDepartmentDAO {

	static Employee emp= new Employee();
	
	public void addEmployeeDepartment(Employee emp,Department dep) {
		
		HashMap<Employee,Department> hashMap=new HashMap<Employee,Department> ();
	hashMap.put(emp,dep);
	System.out.println(hashMap);
	
	}
	
}
