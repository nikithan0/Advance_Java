package com.xworkz.onlineShop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class RunnerClass {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		 try {
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ online_shopping", "root", "Xworkzodc@123");

			 Statement statement = con.createStatement();
			// String query = "insert into onlineshop_info values(1, 'Pallavi', 78928983989, 'pallavi@gmail.com', 'Shivamoga', 577425, '24/8', 'cloth', '100', '10%')";
			 String query1 = "insert into onlineshop_info values(12, 'Amulya', 78928983989, 'ammu@gmail.com', 'gulbarga', 377429, '24/8', 'Watch', '100', '10%')";
			 String query2 = "insert into onlineshop_info values(13, 'joythi', 77928983989, 'joythi@gmail.com', 'ramnagara', 277425, '24/8', 'Bottel', '200', '20%')";
			 String query3 = "insert into onlineshop_info values(14, 'krishna', 79028983989, 'krish@gmail.com', 'mysuru', 387425, '24/8', 'Bag', '100', '30%')";
			 String query4 = "insert into onlineshop_info values(15, 'lokesh', 90928983989, 'lok@gmail.com', 'belagavi', 977425, '24/8', 'Bedsheet', '300', '40%')";
			 String query5 = "insert into onlineshop_info values(16, 'radika', 78928938739, 'radika@gmail.com', 'hubballi', 577429, '24/8', 'EarRings', '100', '50%')";
			 String query6 = "insert into onlineshop_info values(17, 'Kanti', 98028983989, 'kanti@gmail.com', 'daravada', 277425, '24/8', 'Headphone', '500', '60%')";
			 String query7 = "insert into onlineshop_info values(18, 'sowmya', 89038983989, 'sowmya@gmail.com', 'kengeri', 98777, '24/8', 'EarPhone', '600', '70%')";
			 String query8 = "insert into onlineshop_info values(19, 'bhanu', 89388983989, 'bhanu@gmail.com', 'hossalli', 777425, '24/8', 'Slipper', '100', '80%')";
			 String query9 = "insert into onlineshop_info values(20, 'boomi', 89328983989, 'boomi@gmail.com', 'Shivamogga', 377425, '24/8', 'Bangles', '50', '10%')";
			// String query10 = "insert into onlineshop_info values(11, 'Navya', 89328983989, 'navya@gmail.com', 'Shivamoga', 977425, '24/8', 'cloth', '100', '10%')";
			 
			 
			// int i = statement.executeUpdate(query);
			 int i1 = statement.executeUpdate(query1);
			 int i2 = statement.executeUpdate(query2);
			 int i3 = statement.executeUpdate(query3);
			 int i4 = statement.executeUpdate(query4);
			 int i5 = statement.executeUpdate(query5);
			 int i6 = statement.executeUpdate(query6);
			 int i7 = statement.executeUpdate(query7);
			 int i8 = statement.executeUpdate(query8);
			 int i9 = statement.executeUpdate(query9);
			// int i10 = statement.executeUpdate(query10);
			 
			 //System.out.println("effected rows:" +i);
			 System.out.println("effected rows:" +i1);
			 System.out.println("effected rows:" +i2);
			 System.out.println("effected rows:" +i3);
			 System.out.println("effected rows:" +i4);
			 System.out.println("effected rows:" +i5);
			 System.out.println("effected rows:" +i6);
			 System.out.println("effected rows:" +i7);
			 System.out.println("effected rows:" +i8);
			 System.out.println("effected rows:" +i9);
			// System.out.println("effected rows:" +i10);
			 
			 con.close();
	}
		 catch(Exception e){
				e.printStackTrace();
			}

}
}