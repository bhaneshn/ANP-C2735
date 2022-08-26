package View;
import employee.info.Employee;
import service.EmployeService;
public class EmployeeView {
	
	public static void main(String[] args) {
		Employee employee1=new Employee(1,'B',20000,4); // we should create object(emoplyee1) from employee class with parameter
		EmployeService empServ=new EmployeService();
		boolean value=empServ.isEligibleForIncrement(employee1);//here we passed employee1 from employee method which present in the emplyeeServicee
		System.out.println(value);
		
		if(value)//value is from employeeService......
		{
			empServ.incrementSalary(employee1); //here we call the employee salary by using increment method
		}
		System.out.println(employee1.getEmployeeSalary());
		
		
	}
}
