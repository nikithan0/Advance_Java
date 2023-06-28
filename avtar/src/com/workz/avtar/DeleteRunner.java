package com.workz.avtar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avtar", "root", "Xworkzodc@123");
			
			String query = "delete from avtar_infos where id=1";
			
			Statement statement = conn.createStatement();
			
			int i = statement.executeUpdate(query);
			System.out.println("effected rows:"+ i);
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
