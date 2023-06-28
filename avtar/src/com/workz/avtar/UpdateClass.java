package com.workz.avtar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateClass {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avtar", "root", "Xworkzodc@123");
			System.out.println(conn);
			
			String query = "update avtar_infos set avatar_actors = 'C C HPounder' where id=7";
			
			Statement statement = conn.createStatement();

		   int i = statement.executeUpdate(query);
		   System.out.println("effected rows: "+ i);
		   
		   conn.close();
		
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
