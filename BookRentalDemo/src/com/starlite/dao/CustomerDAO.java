package com.starlite.dao;

import com.starlite.model.CustomerDetails;

public class CustomerDAO {

	static CustomerDetails []custArray=new CustomerDetails[100];
	public static boolean addCustomerDetails(CustomerDetails cust) {
		boolean result=false;
		
		for(int i=0;i<custArray.length;i++) {
			if(custArray[i]==null) {
				custArray[i]=cust;
				result=true;
				break;
			}
		}
		return result;
	}
	public static CustomerDetails[] displayCustomerDetails() {
		return custArray;
	}
}
