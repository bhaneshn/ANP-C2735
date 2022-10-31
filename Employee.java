package org.practicaltest.model;

import java.util.Objects;

public class Employee {

	private int id;
	private String empName;
	private String phone;
	private String address;
	private String email;
	private String dept;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String empName, String phone, String address, String email, String dept) {
		super();
		this.id = id;
		this.empName = empName;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", phone=" + phone + ", address=" + address + ", email="
				+ email + ", dept=" + dept + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, dept, email, empName, id, phone);
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
		return Objects.equals(address, other.address) && Objects.equals(dept, other.dept)
				&& Objects.equals(email, other.email) && Objects.equals(empName, other.empName) && id == other.id
				&& Objects.equals(phone, other.phone);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
