package org.practicaltest.service;

import java.util.HashSet;

import org.practicaltest.dao.DepartmentDAO;
import org.practicaltest.model.Department;

public class DepartmentService {

static DepartmentDAO depDAO=new DepartmentDAO();
	
	public void addDepartment(Department department) {
	depDAO.addDepartment(department);
	
	}
	public HashSet<Department> getDepartmentDetails(){
		return depDAO.getDepartmentDetails();
	}
}
