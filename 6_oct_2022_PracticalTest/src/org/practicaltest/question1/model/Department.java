package org.practicaltest.question1.model;

import java.util.Objects;

public class Department implements Comparable<Department>{

	private int departmentId;
	private Departments accountDepartment;
	private Departments PurchaseDepartment;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int departmentId, Departments accountDepartment, Departments purchaseDepartment) {
		super();
		this.departmentId = departmentId;
		this.accountDepartment = accountDepartment;
		PurchaseDepartment = purchaseDepartment;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", accountDepartment=" + accountDepartment
				+ ", PurchaseDepartment=" + PurchaseDepartment + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(PurchaseDepartment, accountDepartment, departmentId);
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
		return PurchaseDepartment == other.PurchaseDepartment && accountDepartment == other.accountDepartment
				&& departmentId == other.departmentId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public Departments getAccountDepartment() {
		return accountDepartment;
	}
	public void setAccountDepartment(Departments accountDepartment) {
		this.accountDepartment = accountDepartment;
	}
	public Departments getPurchaseDepartment() {
		return PurchaseDepartment;
	}
	public void setPurchaseDepartment(Departments purchaseDepartment) {
		PurchaseDepartment = purchaseDepartment;
	}
	@Override
	public int compareTo(Department o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}