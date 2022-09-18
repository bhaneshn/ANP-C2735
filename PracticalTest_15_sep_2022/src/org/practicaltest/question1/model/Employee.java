package org.practicaltest.question1.model;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

	private int employeeId;
	private String employeeName;
	private LocalDate joiningDate;
	
	public Employee() {
		
	}

	public Employee(int employeeId, String employeeName, LocalDate joiningDate) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.joiningDate = joiningDate;
	}
	

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", joiningDate=" + joiningDate
				+ "]";
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName, joiningDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName)
				&& joiningDate == other.joiningDate;
	}
	

	
	
	
}
