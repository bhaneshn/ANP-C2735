package com.starlite.dao;

import com.starlite.model.RentalDetails;

public class RentalDAO {

	static RentalDetails rentalArray[]=new RentalDetails[100];
	public static boolean calculateRentalPrice(RentalDetails rent) {
		boolean result= false;
		for(int i=0;i<rentalArray.length;i++) {
			if(rentalArray[i]==null) {
				rentalArray[i]=rent;
				result=true;
				break;
	}
		}
		return result;
	}
	public static RentalDetails[] displayRentalPrice() {
		return rentalArray;
	}
}
