package com.xworkz.electronics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadRunner {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();		
		}
		try {
			String query = "select * from electronics_item ";
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics", "root", "Xworkzodc@123");
			
		    Statement statement = connection.createStatement();
		    
		    ResultSet result = statement.executeQuery(query);
		    System.out.println(result);
		    if(result!=null) {
		    	while(result.next()) {
		    		System.out.println(result.getInt(1)+" "+ result.getString(2)+" "+result.getString(3)+" "
		    	+result.getString(4)+" "+result.getString(5)+" "+result.getString(6)+" "+result.getString(7)+" "+result.getString(8)+" "+result.getString(9)+" "+result.getString(10));
		    	}
		    }		
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
