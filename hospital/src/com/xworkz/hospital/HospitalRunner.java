package com.xworkz.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class HospitalRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ hospital_info", "root", "Xworkzodc@123");
		
		String query = "insert into  hospital values(20, 'Apollo Hospital', 'Banglore', 150, 'Prathap C Reddy', 'Dr Dinesh Kumar G R', '30', 'Curative', '100', '200')";
		
		
		Statement statement = con.createStatement();
		
		int i = statement.executeUpdate(query);
		
		
		
		System.out.println("effected rows:" +i);
		
		
		
		con.close();
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
