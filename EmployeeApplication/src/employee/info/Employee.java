package employee.info;

public class Employee {

	private int employeeId;
	private char employeeInitial;
	private int employeeSalary;
	private int employeeExperiance;
	
	public Employee() {
		
	}
	public Employee(int Id,char Ini,int Sal,int Exp) {
		employeeId=Id;
		employeeInitial=Ini;
		employeeSalary=Sal;
		employeeExperiance=Exp; 
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	public int getEmployeeExperiance() {
		return employeeExperiance;
	}
	public void setEmployeeExperiance(int employeeExperiance) {
		this.employeeExperiance = employeeExperiance;
	}
	
	
}
