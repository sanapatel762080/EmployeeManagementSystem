package com.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {

	public static Connection connect() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB","root","sana12345");
		
		return conn;
	}
}
