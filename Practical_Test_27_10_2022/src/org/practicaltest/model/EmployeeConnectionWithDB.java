package org.practicaltest.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeConnectionWithDB {

	static Connection connection;
	
	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/practical_27_oct_2022", "root","Password@123");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
