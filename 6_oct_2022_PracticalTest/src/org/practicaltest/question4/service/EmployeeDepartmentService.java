package org.practicaltest.question4.service;

import org.practicaltest.question1.model.Department;
import org.practicaltest.question1.model.Employee;
import org.practicaltest.question3.dao.EmployeeDepartmentDAO;

public class EmployeeDepartmentService {

	static EmployeeDepartmentDAO empDep=new EmployeeDepartmentDAO();
	public void addEmployeeDepartment(Employee emp,Department dep) {
		empDep.addEmployeeDepartment(emp, dep);
	}
}
