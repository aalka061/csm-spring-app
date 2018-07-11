package com.alka061.csm.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// TODO: fill this in
Class.forName("org.postgresql.Driver");
		
		String url = "jdbc:postgresql://localhost:5432/"
				+ "postgres?currentSchema=customer_tracker";
		String username = "postgres";
		String password = "abd159753";
		
		try {
			Connection db = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is successful");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
