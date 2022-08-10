package org.mycompany.model;

public class Employee {
	int employeeId;
	char employeeInitial;
	int employeeSalary;
	
	public Employee() {
	
	}
	public Employee(int id,char initial,int salry ) {
		employeeId=id;
		employeeInitial=initial;
		employeeSalary=salry;
	}	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public char getEmployeeInitial() {
		return employeeInitial;
	}
	public void setEmployeeInitial(char employeeInitial) {
		this.employeeInitial = employeeInitial;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
}

