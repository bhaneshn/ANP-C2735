package com.starlite.service;

import com.starlite.dao.RentalDAO;
import com.starlite.model.RentalDetails;

public class RentalService {

	public static boolean calculateRentalPrice(RentalDetails rent) {
		boolean result=false;
		RentalDAO.calculateRentalPrice(rent);
		return result;
	}
	public static RentalDetails[] displayRentalPrice() {
		return RentalDAO.displayRentalPrice();
	}
}
