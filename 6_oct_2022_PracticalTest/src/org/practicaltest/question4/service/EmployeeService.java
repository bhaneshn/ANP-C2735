package org.practicaltest.question4.service;

import java.util.HashSet;

import org.practicaltest.question1.model.Employee;
import org.practicaltest.question3.dao.EmployeeDAO;

public class EmployeeService {

	static EmployeeDAO empDAO=new EmployeeDAO();
	
	public void addEmployee(Employee employee) {
	empDAO.addEmployee(employee);
	
	}
	public HashSet<Employee> getEmployeeDetails(){
		return empDAO.getEmployeeDetails();
	}
}
