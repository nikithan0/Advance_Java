package com.xworkz.facebook.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.facebook.dto.FacebookDto;

public class FacebookRepoImpl implements FacebookRepository {

	@Override
	public boolean validateAndSave(FacebookDto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root",
					"Xworkzodc@123");
			System.out.println(conn);

			String query = "insert into facebook_info values(?,?,?,?,?,?,?,?)";

			PreparedStatement statemet = conn.prepareStatement(query);

			statemet.setInt(1, dto.getId());
			statemet.setString(2, dto.getFirstName());
			statemet.setString(3, dto.getLastName());
			statemet.setString(4, dto.getDOB());
			statemet.setString(5, dto.getEmail());
			statemet.setLong(6, dto.getPhoneNumber());
			statemet.setString(7, dto.getGender());
			statemet.setString(8, dto.getPassword());

			int i = statemet.executeUpdate();
			System.out.println("effected rows:" + i);

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean update(FacebookDto dto, int id) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");

		String query = "update facebook_info set firstName=?, lastName=?, DOB=?, email=?, phoneNumber=?,gender=?, password=? where id =? ";

		PreparedStatement statemet = conn.prepareStatement(query);

		statemet.setInt(1, dto.getId());
		statemet.setString(2, dto.getFirstName());
		statemet.setString(3, dto.getLastName());
		statemet.setString(4, dto.getDOB());
		statemet.setString(5, dto.getEmail());
		statemet.setLong(6, dto.getPhoneNumber());
		statemet.setString(7, dto.getGender());
		statemet.setString(8, dto.getPassword());

		int i = statemet.executeUpdate();
		System.out.println("Effected rows:" + i);

		conn.close();
		return false;
	}

	@Override
	public boolean read() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");

		String query = "select * from facebook_info";

		PreparedStatement statement = conn.prepareStatement(query);

		ResultSet result = statement.executeQuery();
		if (result != null) {
			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
						+ result.getString(4) + " " + result.getString(5) + " " + result.getLong(6) + " "
						+ result.getString(7) + " " + result.getString(8));
			}
		}

		return false;
	}

	@Override
	public boolean delete(FacebookDto dto, int id) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");

		String query = "delete from facebook_info where id = 2";

		Statement statement = conn.createStatement();
		int i = statement.executeUpdate(query);
		System.out.println("effected rows:" + i);

		conn.close();
		return false;
	}

	@Override
	public boolean updateByEmail(String firstName, String email) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");

		String query = "update facebook_info set firstName =? where email = ?";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setString(1, firstName);
		statement.setString(2, email);

		int i = statement.executeUpdate();
		System.out.println("effected rows:" + i);

		return false;
	}

	@Override
	public boolean deleteByEmail(String email) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");

		String query = "delete from  facebook_info where email = ?";

		PreparedStatement statement = conn.prepareStatement(query);
		statement.setString(1, email);

		int i = statement.executeUpdate();
		System.out.println("effected rows:" + i);

		return false;
	}

	@Override
	public boolean readByEmail(String email) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");

		String query = "select * from  facebook_info where email = ?";

		PreparedStatement statement = conn.prepareStatement(query);
		statement.setString(1, email);

		ResultSet result = statement.executeQuery();
		if (result != null) {
			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
						+ result.getString(4) + " " + result.getString(5) + " " + result.getLong(6) + " "
						+ result.getString(7) + " " + result.getString(8));
			}

		}
		return false;

	}
}
