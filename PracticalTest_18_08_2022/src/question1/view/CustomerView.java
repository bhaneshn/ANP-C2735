package question1.view;
import question1.model.Customer;
import question1.service.customerService;
public class CustomerView {
	
	public static void main(String[] args) {
		
		Customer custObj=new Customer(1,"Bhanesh",23);
		customerService custSerObj=new customerService();
		boolean value=custSerObj.checkEligibilty(custObj);
		System.out.println(value);
		
	
		
	}
}
