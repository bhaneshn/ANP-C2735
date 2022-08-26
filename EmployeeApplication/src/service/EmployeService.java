package service;
import employee.info.Employee;
public class EmployeService {
//	private int a=80;
	public void incrementSalary(Employee e) {
		int salary=e.getEmployeeSalary();
		int newSalary=salary+5000;
		e.setEmployeeSalary(newSalary);
	
	
   }
	public boolean isEligibleForIncrement(Employee emp) {  //this is the method from 4 flavor of method
		boolean result=false;
		int exp=emp.getEmployeeExperiance(); // why we get employeeExperi cuz this used for conditional operators
		if(exp>1)         // conditional operators (>)
		{
			result= true;
		}
		else {
			result=false;
		}
		return result;
	}
}
