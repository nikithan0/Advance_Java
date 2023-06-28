package com.xworkz.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CustomerRunner {

	public static void main(String[] args) {
		
		try {
			//load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e){
			e.printStackTrace();
			}
		try {
			//connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root","Xworkzodc@123");
		//System.out.println(con.getSchema());
		
		//writing query
		String query = "insert into customer_info values(7, 'Pallavi', 'Shivamoga')";
		
		//creating statement object
		Statement statement = con.createStatement();
		
//		//executing statement to get the result 
//		boolean insert = statement.execute(query);
		
		int i = statement.executeUpdate(query);
		System.out.println("effected rows:" +i);
		
		//System.out.println(insert);
		
		//close the connection
		con.close();
		}
		
		catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
