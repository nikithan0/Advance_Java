package com.workz.avtar.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.workz.avtar.dto.AvtarDto;

public class AvtarRepoImpl implements AvtarRepository {

	@Override
	public boolean save(AvtarDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avtar", "root", "Xworkzodc@123");
			System.out.println(conn);

			String query = "insert into avtar_infos values(?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement statement = conn.prepareStatement(query);
			System.out.println(statement);

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getAvatar_actors());
			statement.setInt(3, dto.getAge());
			statement.setString(4, dto.getDateOfBirth());
			statement.setString(5, dto.getNationality());
			statement.setBoolean(6, dto.isMarriagestatus());
			statement.setInt(7, dto.getTotalMovies());
			statement.setString(8, dto.getFirstMovie());
			statement.setString(9, dto.getLastMovie());
			statement.setString(10, dto.getCharecterName());

			int i = statement.executeUpdate();
			System.out.println("effected rows:" + statement);

			if (i > 0) {
				System.out.println("Record inserted");
			} else {
				System.out.println("Record not inserted");
			}
			conn.commit();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	

	@Override
	public boolean update(AvtarDto dto, int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/avtar", "root",
					"Xworkzodc@123");

			String query = "update avtar_infos set avatar_actors=?, age=?, dateOfBirth=?, Nationality=?, Marriagestatus=?, TotalMovies=?, firstMovie=?, lastMovie=?, CharecterName=? where id =? ";

			PreparedStatement statement = connection.prepareStatement(query);
			// System.out.println(statement);

			statement.setString(1, dto.getAvatar_actors());
			statement.setInt(2, dto.getAge());
			statement.setString(3, dto.getDateOfBirth());
			statement.setString(4, dto.getNationality());
			statement.setBoolean(5, dto.isMarriagestatus());
			statement.setInt(6, dto.getTotalMovies());
			statement.setString(7, dto.getFirstMovie());
			statement.setString(8, dto.getLastMovie());
			statement.setString(9, dto.getCharecterName());
			statement.setInt(10, id);

			int i = statement.executeUpdate();

			if (i > 0) {
				System.out.println("Record updated :" + i);
			} else {
				System.out.println("Record not update:" + i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
