package org.spring.jdbc;

import org.spring.jdbc.daoimpl.PassengerDAOImpl;
import org.spring.jdbc.entity.Passenger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext af = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	PassengerDAOImpl passDao= (PassengerDAOImpl) af.getBean("passdao");
    	
//    	int result1= passDao.savePassenger(new Passenger(1, 444555, 23, 500, "Wolverine"));
//    	System.out.println(result1);
    	
    	int result2= passDao.updatePassenger(new Passenger(1, 444555, 23, 500, "Wolve"));
    	System.out.println(result2);
    	
    	Passenger passenger=new Passenger();
    	
    	passenger.setId(1);
    	int result3 = passDao.deletePassenger(passenger);
    	System.out.println(result3);
    	
    	
    	
    }
}
