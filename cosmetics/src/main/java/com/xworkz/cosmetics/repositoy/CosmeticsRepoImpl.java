package com.xworkz.cosmetics.repositoy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.cosmetics.dto.CosmeticsDto;

public class CosmeticsRepoImpl implements CosmeticsRepository {

	@Override
	public boolean save(CosmeticsDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cosmetics", "root",
					"Xworkzodc@123");

			String query = "insert into cosmetics_info values (?,?,?,?,?,?,?,?,?,?)";
			System.out.println(query);

			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, dto.getFirstName());
			statement.setString(2, dto.getLastName());
			statement.setString(3, dto.getEmail());
			statement.setString(4, dto.getAge());
			statement.setString(5, dto.getPhoneNumber());
			statement.setString(6, dto.getLocation());
			statement.setString(7, dto.getPincode());
			statement.setString(8, dto.getProductName());
			statement.setString(9, dto.getQuantity());
			statement.setString(10, dto.getPayment());

			int i = statement.executeUpdate();
			if (i > 0) {
				System.out.println("Data is saved");
				return true;
			} else {
				System.out.println("Data is not saved");
			}

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean findByFirstName(String firstName) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cosmetics", "root",
					"Xworkzodc@123");

			String query = "select * from cosmetics_info where firstName = ? ";
		//	System.out.println(query);

			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, firstName);

			ResultSet result = statement.executeQuery();
			if (result != null) {
				while (result.next()) {
					System.out.println("Found");
					System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3) + " "
							+ result.getString(4) + " " + result.getString(5) + " " + result.getString(6) + " "
							+ result.getString(7) + " " + result.getString(8) + " " + result.getString(9) + " "
							+ result.getString(10));
					return true;
				}
			}else {
				System.out.println("not found");
				return false;
			}
			statement.close();
			con.close();  

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
