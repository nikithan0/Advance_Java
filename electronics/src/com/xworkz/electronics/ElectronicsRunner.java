package com.xworkz.electronics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ElectronicsRunner {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics", "root", "Xworkzodc@123");			
			
			String query = "insert into electronics_item values(20,'Iron box', 3000, '3year', '31May', 'Red', '2kg', 1500, 103, 8908776783)";
			
			
			Statement statement = connection.createStatement();
			
			int i = statement.executeUpdate(query);		
			System.out.println("effected rows:" +i);
						
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
