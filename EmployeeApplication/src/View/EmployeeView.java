package View;
import employee.info.Employee;
import service.EmployeService;
public class EmployeeView {
	
	public static void main(String[] args) {
		Employee employee1=new Employee(1,'B',20000,2); // we should create object(emoplyee1) from employee class with parameter
		EmployeService empServ=new EmployeService();
		boolean value=empServ.isEligibleForIncrement(employee1);//this is from method
		System.out.println(value);
		
	}
}
