package org.praticaltest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root","Password@123");
			Statement statement=connection.createStatement();
			
//			statement.executeUpdate("create table Employee(id INT(5),name varchar(15),phone INT(15),address varchar(15),email varchar(20),department varchar(20))");		
//			System.out.println("Table Created successfully");
			PreparedStatement prestatement=connection.prepareStatement("insert into employee values(?,?,?,?,?,?)");
//			prestatement.setInt(1, 101);
//			prestatement.setString(2, "Bhanesh");
//			prestatement.setInt(3, 89890909);
//			prestatement.setString(4, "MH");
//			prestatement.setString(5,"bhaneshn@gmail.com");
//			prestatement.setString(6, "Technical");
			
//			prestatement.setInt(1, 102);
//			prestatement.setString(2, "Akash");
//			prestatement.setInt(3, 98880809);
//			prestatement.setString(4, "MP");
//			prestatement.setString(5,"akash@gmail.com");
//			prestatement.setString(6, "Maunfacturing");
//			
//			prestatement.setInt(1, 103);
//			prestatement.setString(2, "Krutika");
//			prestatement.setInt(3, 98880809);
//			prestatement.setString(4, "MP");
//			prestatement.setString(5,"ktutika@gmail.com");
//			prestatement.setString(6, "Design&Development");
			
//			prestatement.setInt(1, 104);
//			prestatement.setString(2, "ravi");
//			prestatement.setInt(3, 66564809);
//			prestatement.setString(4, "AP");
//			prestatement.setString(5,"ravinawale@gmail.com");
//			prestatement.setString(6, "DataScientists");
			
//			prestatement.setInt(1, 105);
//			prestatement.setString(2, "vikram");
//			prestatement.setInt(3, 90080809);
//			prestatement.setString(4, "CP");
//			prestatement.setString(5,"vika@gmail.com");
//			prestatement.setString(6, "Development");
//			int result=prestatement.executeUpdate();
//			System.out.println(result);
//			System.out.println("Table column inserted");
			
//			String s="update Employee set phone=5554545 where id=103";
//			statement.executeUpdate(s);
//			System.out.println("Updated");
			
			String s="delete from employee where id=102";
			statement.executeUpdate(s);
			System.out.println("Updated");
			statement.close();
//			prestatement.close();
			connection.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
