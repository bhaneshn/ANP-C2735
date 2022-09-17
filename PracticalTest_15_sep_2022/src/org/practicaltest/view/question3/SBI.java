package org.practicaltest.view.question3;

import org.practicaltest.model.question3.ICICI;
import org.practicaltest.model.question3.RBI;
import org.practicaltest.model1.question3.HDFC;

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
