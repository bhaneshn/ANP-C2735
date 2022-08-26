package org.mycompany.view;
import org.mycompany.model.Employee;
import org.mycompany.service.EmployeeService;
public class EmployeeView {
	
	public static void main(String[] args) {
		
//		Employee emp2=new Employee(3,'C',50000);	
//		emp2.setEmployeeSalary(2000);
//		System.out.println("emp2:"+emp2.getEmployeeSalary());
		
		Employee Employee1= new Employee (2,'B',20000);
		EmployeeService Employee=new EmployeeService(); // object
		System.out.println("Old salary:"+Employee1.getEmployeeSalary());
		Employee updateSal=Employee.calculateSalaryIncrement(Employee1);//here we passes objecr employee and increment value
		System.out.println("Employee Id is : "+updateSal.getEmployeeId());
		System.out.println("Employee Initial : "+ updateSal.getEmployeeInitial());
		System.out.println("Employee Salary : "+ updateSal.getEmployeeSalary());
		
		
		
		
	}
}
