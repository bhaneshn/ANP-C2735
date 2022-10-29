package org.practicaltest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.practicaltest.model.Employee;
import org.practicaltest.model.EmployeeConnectionWithDB;

public class EmployeeDAO {

	public static boolean insertEmployeeInfo(Employee employee) {
		boolean result =false;
		
		try {
			Connection connection=EmployeeConnectionWithDB.createConnection();
			String value="insert into Employee(id,empName,phone,address,email,dept)values(?,?,?,?,?,?)";
			
			PreparedStatement preStatment=connection.prepareStatement(value);
			preStatment.setInt(1,employee.getId());
			preStatment.setString(2, employee.getEmpName());
			preStatment.setString(3, employee.getPhone());
			preStatment.setString(4, employee.getAddress());
			preStatment.setString(5, employee.getEmail());
			preStatment.setString(5, employee.getDept());
			
			result=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static boolean updateEmployee(String phone) {
		boolean result=false;
		
		try {
			Connection connection=EmployeeConnectionWithDB.createConnection();
			String s="update Employee set phone=? where id=? ";
			PreparedStatement preStatment=connection.prepareStatement(s);
			
			preStatment.setString(3,phone);
			preStatment.executeUpdate();
			result=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		boolean result = false;
		
		try {
			Connection connection = EmployeeConnectionWithDB.createConnection();
			String value = "delete from Employee where id=?";
			
			PreparedStatement pstmt = connection.prepareStatement(value);
			pstmt.setInt(1, empId);
			
			pstmt.executeUpdate();
			result = true;

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return result;
	}
	
	public static void displayAllInformation() {
		
		
		try {
			Connection connection=EmployeeConnectionWithDB.createConnection();
			Statement st=connection.createStatement();
			String s="select * from Employee";
			ResultSet result=st.executeQuery(s);
			
			while(result.next()) {
				int id=result.getInt(1);
				String empName=result.getString(2);
				String phone=result.getString(3);
				String address=result.getString(4);
				String email=result.getString(5);
				String dept=result.getString(6);
				
				System.out.println();
				
				System.out.println("Id : "+id);
				System.out.println("empName : "+empName);
				System.out.println("Phone : "+phone);
				System.out.println("Address : "+address);
				System.out.println("Email : "+email);
				System.out.println("Dept : "+dept);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
