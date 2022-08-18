package question1.service;
import question1.model.Customer;
public class customerService {
	

	
	public boolean checkEligibilty(Customer Obj) {
		boolean result=true;
		int cust=Obj.getAge();
		if(cust>=18) {
			System.out.println("yes , eligible for vote");
			
		}
		else {
			System.out.println("not eleigible for vote ,try next time");
		}
		return result;
	}
}
