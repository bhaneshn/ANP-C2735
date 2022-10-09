package org.practicaltest.model;

import java.util.Objects;

public class Department implements Comparable<Department>{

	private int departmentId;
	private Departments departmentName;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int departmentId, Departments departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(departmentId, departmentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return departmentId == other.departmentId && departmentName == other.departmentName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public Departments getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(Departments departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public int compareTo(Department o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}