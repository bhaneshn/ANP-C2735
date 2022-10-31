package org.practicaltest.main;

import java.io.IOException;
import java.util.Scanner;

import org.practicaltest.dao.EmployeeDAO;
import org.practicaltest.model.Employee;

public class Main {

	EmployeeDAO empDAO=new EmployeeDAO();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Application is Started Please select your choice");
		
		while(true) {
			System.out.println("Press 1: Add Employee Information");
			System.out.println("Press 2: Update Employee Information");
			System.out.println("Press 3: Delete Employee Information");
			System.out.println("Press 4: Display All Employee Information");
			System.out.println("Press 5: To Exit");
			System.out.println();
			System.out.println("Enter Your choice");
			int choice=scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Employee Information");
				System.out.println("Enter Employee Id:");
				int id=scan.nextInt();
				scan.nextLine();
				System.out.println("Enter Employee Name:");
				String name=scan.nextLine();
				
				System.out.println("Enter Employee Phone:");
				String phone=scan.nextLine();
				
				System.out.println("Enter Employee EmailId:");
				String email=scan.nextLine();
				
				System.out.println("Enter Employee Address:");
				String address=scan.nextLine();
				
				System.out.println("Enter Employee Department:");
				String dept=scan.nextLine();
				
				Employee employee=new Employee(id,name,phone,email,address,dept);
				boolean isAdded=EmployeeDAO.insertEmployeeInfo(employee);
				
				if(isAdded) {
					System.out.println("Employee Added Successfully");
				}
				else {
					System.out.println("You Entered Something wrong ! Please Check and enter again");
				}
				
				System.out.println(employee);
				break;
				
			case 2:
				System.out.println("Update Employee Information");
				System.out.println("Enter Employee Id:");
				int empid=scan.nextInt();
				scan.nextLine();
				System.out.println("Enter Employee phone");
				String empPhone=scan.nextLine();
				
				boolean isUpdate=EmployeeDAO.updateEmployee(empPhone,empid);
				
				if(isUpdate) {
					System.out.println("Employee Information Updated Successfully");
				}else {
					System.out.println("Not Updated, please update again");
				}
				break;
				
			case 3:
				System.out.println("Delete Employee Information");
				System.out.println("Enter Employee Id:");
				int empId=scan.nextInt();
				boolean isDelete=EmployeeDAO.deleteEmployee(empId);
				
				if(isDelete) {
					System.out.println("Employee Information deleted Successfully");
				}else {
					System.out.println("Not Deleted, please update again");
				}
				break;
			
			case 4:
				System.out.println("Display All  Information");
				EmployeeDAO.displayAllInformation();
				break;
				
			
				
			case 5:
				System.out.println("Thank You For Your time");
				System.exit(0);
				break;
				
			default :
				System.out.println("Invalid Choice");
			}
			
			
		}
	
	}

}
