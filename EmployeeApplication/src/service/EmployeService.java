package service;
import employee.info.Employee;
public class EmployeService {
	
	public boolean isEligibleForIncrement(Employee emp) {  //this is the method from 4 flavor of method
		boolean result=false;
		int exp=emp.getEmployeeExperiance();
		if(exp>1)         // conditional operators (>)
		{
			result= true;
		}
			return result;
	}
}
