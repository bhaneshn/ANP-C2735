package org.practicaltest.question1.view;

import java.time.LocalDate;
import java.util.Scanner;

import org.practicaltest.question1.model.Employee;

public class EmployeeView {

	public static void displayEmployeeInformation(Employee[] employee) {
//		Scanner scanner=new Scanner(System.in);
//		for(int i=1;i<employee.length;i++) {
//			if(employee[i]==null) {
//				break;
//			}
//			else {
//			
//				System.out.println("Enter Employee Information");
//				System.out.println();
//				System.out.println("Enter Employee Id: ");
//				employee[i].setEmployeeId(scanner.nextInt());
//				scanner.nextLine();
//				System.out.println("Enter Employee Name: ");
//				employee[i].setEmployeeName(scanner.nextLine());
//				System.out.println("Enter Employee Joining Date: ");
//				employee[i].setJoiningDate(scanner.nextInt());
//				System.out.println();
//				System.out.println("Thank you .....");
//			}
//			
//		}
	}
	public static void main(String[] args) {
		Employee []emp=new Employee[5];
		Scanner scanner=new Scanner(System.in);
		for(int i=1;i<emp.length;i++) {
			System.out.println("Enter Employee Id: ");
			int id=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Employee Name: ");
			String name=scanner.nextLine();
			System.out.println("Enter Employee Joining Date: ");
			String date=scanner.nextLine();
			LocalDate date1=LocalDate.parse(date);
			System.out.println(date1);
			emp[i]=new Employee(id,name,date1);
		}
			
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		Employee emp4=new Employee();
		Employee emp5=new Employee();
		Employee emp6=new Employee();
		
		emp[0]=emp1;
		emp[1]=emp2;
		emp[2]=emp3;
		emp[3]=emp4;
		emp[4]=emp5;
		emp[5]=emp6;
		
		displayEmployeeInformation(emp);
		
		
		
	}
}
