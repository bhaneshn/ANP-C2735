package org.practicaltest.service;

import java.util.HashSet;

import org.practicaltest.dao.EmployeeDAO;
import org.practicaltest.model.Department;
import org.practicaltest.model.Employee;

public class EmployeeDepartmentService {

	static HashSet<Employee> hashSet=new HashSet<Employee>();
	
	static EmployeeDAO empDAO=new EmployeeDAO();
	
	public void addEmployeeDepartment(HashSet<Employee> emp,HashSet<Department> dep) {
		empDAO.getEmployeeDetails();
	}
}
