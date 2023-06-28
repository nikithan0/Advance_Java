package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadBank {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e){
			e.printStackTrace();
		}
		try {
			String query = "select * from bank_info";
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Xworkzodc@123");
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(query);
			System.out.println(result);
			if(result!=null) {
				while(result.next()) {
					System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(2)+" "+ result.getString(3)+" "+
		    	result.getString(4)+" "+result.getString(5)+" "+result.getString(6)+" "+result.getString(7)+" "+result.getString(8)+" "+result.getString(9)+" "+result.getString(10));
				}
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
