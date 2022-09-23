package com.starlite.service;

import com.starlite.dao.CustomerDAO;
import com.starlite.model.CustomerDetails;

public class customerService {

	public static boolean addCustomerDetails(CustomerDetails cust) {
		boolean result=false;
		CustomerDAO.addCustomerDetails(cust);
		return result;
	}
	public static CustomerDetails[] displayCustomerDetails() {
		return CustomerDAO.displayCustomerDetails();
	}
}
