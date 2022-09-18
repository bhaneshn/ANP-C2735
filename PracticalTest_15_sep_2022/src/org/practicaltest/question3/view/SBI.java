package org.practicaltest.question3.view;

import org.practicaltest.question3.model.ICICI;
import org.practicaltest.question3.model.RBI;
import org.practicaltest.question3.model1.HDFC;

public class SBI extends RBI implements ICICI,HDFC{

	public SBI(String bankName, int bankAccountNumber) {
		super(bankName, bankAccountNumber);
		
	}

	
	public void displayInfo() {
	System.out.println("this is the class of SBI");
		
	}
	
	public static void main(String[] args) {
		SBI sbi=new SBI(bankBranchName, bankAccountNumber);
		sbi.displayInfo();
		sbi.getInfo(bankBranchName, bankAccountNumber);
		sbi.getInfo(bankBranchName, bankBranchName, bankAccountNumber);
	}

}
