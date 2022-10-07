package org.practicaltest.question4.service;

import java.util.HashSet;

import org.practicaltest.question1.model.Department;
import org.practicaltest.question3.dao.DepartmentDAO;

public class DepartmentService {

static DepartmentDAO depDAO=new DepartmentDAO();
	
	public void addDepartment(Department department) {
	depDAO.addDepartment(department);
	
	}
	public HashSet<Department> getDepartmentDetails(){
		return depDAO.getDepartmentDetails();
	}
}
