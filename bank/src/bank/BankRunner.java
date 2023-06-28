package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BankRunner {

	public static void main(String[] args) {
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 try {
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ bank", "root", "Xworkzodc@123");
			 
			// String query = "insert into bank_info values(1, 'HDFC', 'Banglore', 'Banglore', '10A.M', '4P.M', 25, 40000000, 2567188917, 's10937' )";
			 String query = "insert into bank_info values(10, 'HousingDeveloment co-operation', 'Mysuru', 'Mysuru', '10A.M', '4P.M', 25, 400000, 2567188917, 's10937' )";
			 String query1 = "insert into bank_info values(11, 'CitBank', 'Haveri', 'Haveri', '10A.M', '3P.M', 26, 50000, 2578188917, 's78937' )";
			 String query2 = "insert into bank_info values(12, 'Standard Chartered', 'Davangere', 'Davangere', '11A.M', '4P.M', 45, 20000, 9067188917, 's10947' )";
			 String query3 = "insert into bank_info values(13, 'BharatAirtel Bank', 'Shivamoga', 'Shivamoga', '9A.M', '3.30P.M', 47, 30000, 9767188917, 's14937' )";
			 String query4 = "insert into bank_info values(14, 'Bank of India', 'Hubballi', 'Hubballi', '10A.M', '3P.M', 55, 25000, 2567188907, 's98937' )";
			 String query5 = "insert into bank_info values(15, 'Indigo', 'Banglore', 'Banglore', '11A.M', '4P.M', 53, 44000, 9867188917, 's98937' )";
			 String query6 = "insert into bank_info values(16, 'CitGroup', 'Haveri', 'Haveri', '10A.M', '4P.M', 72, 50000, 9767188917, 's93987' )";
			 String query7 = "insert into bank_info values(17, 'RBL', 'Davangere', 'Davangere', '9A.M', '3P.M', 30, 45000, 6567188917, 's893937' )";
			 String query8 = "insert into bank_info values(18, 'IDBI', 'Hosadurga', 'Hosadurga', '9A.M', '3P.M', 30, 45000, 6567188917, 's893937' )";
			 String query9 = "insert into bank_info values(19, 'CS Bank', 'Shivamoga', 'Shivamoga', '9A.M', '3P.M', 30, 45000, 6567188917, 's893937' )";
			 String query10 = "insert into bank_info values(20, 'CitUnion Bank', 'Hassan', 'Hassan', '9A.M', '3P.M', 30, 45000, 6567188917, 's893937' )";

			 
			 Statement statement = con.createStatement();
			 
			 int i = statement.executeUpdate(query);
			 int i1 = statement.executeUpdate(query1);
			 int i2 = statement.executeUpdate(query2);
			 int i3 = statement.executeUpdate(query3);
			 int i4 = statement.executeUpdate(query4);
			 int i5 = statement.executeUpdate(query5);
			 int i6 = statement.executeUpdate(query6);
			 int i7 = statement.executeUpdate(query7);
			 int i8 = statement.executeUpdate(query8);
			 int i9 = statement.executeUpdate(query9);
			 int i10 = statement.executeUpdate(query10);
			 
			 
			 System.out.println("effected rows:" +i);
			 System.out.println("effected rows:" +i1);
			 System.out.println("effected rows:" +i2);
			 System.out.println("effected rows:" +i3);
			 System.out.println("effected rows:" +i4);
			 System.out.println("effected rows:" +i5);
			 System.out.println("effected rows:" +i6);
			 System.out.println("effected rows:" +i7);
			 System.out.println("effected rows:" +i8);
			 System.out.println("effected rows:" +i9);
			 System.out.println("effected rows:" +i10);
			
			 
			 
			 con.close();
		 }
		 catch(Exception  e){
			 e.printStackTrace();		 
		 }

	}

}
