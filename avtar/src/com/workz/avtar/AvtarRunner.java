package com.workz.avtar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AvtarRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avtar", "root", "Xworkzodc@123");
			System.out.println(conn);
			
			String quarry= "insert into avtar_infos values(10,'C C H Pounder',70,'25 Dec','U.S',true,27,'Guyanese-born','The Shield','Moat')";
			
		 Statement statement =conn.createStatement();
	     int i=statement.executeUpdate(quarry);
         System.out.println("Effected row:"+ i);	
     
     conn.close();
		
		
		
			
		
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
