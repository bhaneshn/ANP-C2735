package org.mycompany.service;
import org.mycompany.model.Employee;
public class EmployeeService {
	
	public Employee calculateSalaryIncrement(Employee obj1) {  //here we accept employee obj1
		
	obj1.setEmployeeSalary(obj1.getEmployeeSalary()/*this is for update*/+(obj1.getEmployeeSalary()*25)/100);
	return obj1;
	}
	
	
}
