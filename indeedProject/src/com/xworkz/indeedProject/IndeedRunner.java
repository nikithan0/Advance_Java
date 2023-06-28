package com.xworkz.indeedProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IndeedRunner {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/indeed", "root", "Xworkzodc@123");
				
				//String query = "insert into indeed_info values(1,'Pallavi','23','B.Sc', 9082783652, 'Java', '23/12/2001', 2022, '89%', 'Fresher')";
				String query = "insert into indeed_info values(10, 'Aswini', '25', 'M.Sc', 9174631829, 'Full stack', '11/08/1999', 2020, '88%', '2yrs experienced')"; 
				
				Statement statement = con.createStatement();
				
				int i = statement.executeUpdate(query);				
				System.out.println("effected rows: "+i);
				
				con.close();
			}
			catch(SQLException ec) {
				ec.printStackTrace();
			}
		

	}

}
