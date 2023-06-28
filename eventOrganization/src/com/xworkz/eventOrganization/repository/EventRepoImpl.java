package com.xworkz.eventOrganization.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.eventOrganization.dto.EventDto;

public class EventRepoImpl implements EventRepository {

	@Override
	public boolean save(EventDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try {
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/eventOrganization", "root", "Xworkzodc@123");
			
			String query = "insert into event_info values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement statement = conn.prepareStatement(query);
			
			statement.setInt(1,dto.getId());
			statement.setString(2, dto.getEvent_name());
			statement.setString(3, dto.getOrganizedBy());
			statement.setString(4, dto.getConductedBy());
			statement.setString(5, dto.getLocation());
			statement.setString(6, dto.getDate());
			statement.setString(7, dto.getTime());
			statement.setString(8, dto.getSpecial_guest());
			statement.setInt(9, dto.getExpected_peoples());
			statement.setInt(10, dto.getTotal_peoples());
			statement.setInt(11, dto.getEventPrice());
			statement.setString(12, dto.getEmailId());
			statement.setLong(13, dto.getPhoneNumber());
			statement.setInt(14, dto.getTotalEvents());
			statement.setString(15, dto.getDuration());
			
			int i = statement.executeUpdate();
			
			if(i>0) {
				System.out.println("Record updated :"+ i);
			}else {
				System.out.println("Record not updated:" + i);
			}
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean updateById(int expected_peoples) {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(Exception e){
				e.printStackTrace();
			}
			
			try {
				Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/eventOrganization", "root", "Xworkzodc@123");
				
				String query = "update event_info set expected_peoples=? where id=1";
				
				PreparedStatement statement = conn.prepareStatement(query);
				
				statement.setInt(1, expected_peoples);
				
				int i = statement.executeUpdate();
				System.out.println(i);
		
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			return false;
	}
	@Override
	public boolean updateByName(String event_name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try {
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/eventOrganization", "root", "Xworkzodc@123");
			
			String query = "update event_info set location=? where event_name='College function'";
			
			PreparedStatement statement = conn.prepareStatement(query);
			
			statement.setString(1, event_name);
			
			int i = statement.executeUpdate();
			//System.out.println(i);
			
			if(i>0) {
				System.out.println("Record updated :"+ i);
			}else {
				System.out.println("Record not updated:" + i);
			}
			
			conn.close();
	
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean updateEmail(String emailId) {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(Exception e){
				e.printStackTrace();
			}
			
			try {
				Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/eventOrganization", "root", "Xworkzodc@123");
				
				String query = "update event_info set emailId=? where id = 2";
				
				PreparedStatement statement = conn.prepareStatement(query);
				
				statement.setString(1, emailId);
				
				int i = statement.executeUpdate();
				System.out.println(statement);
				
				if(i>0) {
					System.out.println("Record updated :"+ i);
				}else {
					System.out.println("Record not updated:" + i);
				}
				
				conn.close();
		
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			return false;
	
	}
	@Override
	public boolean updateByDto(EventDto dto,  int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try {
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/eventOrganization", "root", "Xworkzodc@123");
			
			String query = "update event_info set event_name=?, organizedBy=?, conductedBy=?, location=?,date=?, time=?, special_guest=?, expected_peoples=?, total_peoples=?, eventPrice=?, emailId=?, phoneNumber=?, totalEvents=?, duration=? where id = ?";
			
			PreparedStatement statement = conn.prepareStatement(query);
			
			
			statement.setString(1,dto.getEvent_name());
			statement.setString(2,dto.getOrganizedBy());
			statement.setString(3,dto.getConductedBy());
			statement.setString(4,dto.getLocation());
			statement.setString(5,dto.getDate());
			statement.setString(6,dto.getTime());
			statement.setString(7,dto.getSpecial_guest());
			statement.setInt(8,dto.getExpected_peoples());
			statement.setInt(9,dto.getTotal_peoples());
			statement.setInt(10,dto.getEventPrice());
			statement.setString(11,dto.getEmailId());
			statement.setLong(12,dto.getPhoneNumber());
			statement.setInt(13,dto.getTotalEvents());
			statement.setString(14,dto.getDuration());
			statement.setInt(15, id);
			
			
			int i = statement.executeUpdate();
			System.out.println(statement);
			
			if(i>0) {
				System.out.println("Record updated :"+ i);
			}else {
				System.out.println("Record not updated:" + i);
			}
			
			conn.close();
	
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean updating(String organizedBy, String conduBy, String location, String date, String time) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try {
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/eventOrganization", "root", "Xworkzodc@123");
			
			String query = "update event_info set organizedBy=?, conductedBy=?, location=?, date=?, time=? where id = 3";
			
			PreparedStatement statement = conn.prepareStatement(query);
			
			statement.setString(1, organizedBy);
			statement.setString(2, conduBy);
			statement.setString(3, location);
			statement.setString(4, date);
			statement.setString(5, time);
																																																																																																																																																	
			
			int i = statement.executeUpdate();
			System.out.println(statement);
			
			if(i>0) {
				System.out.println("Record updated :"+ i);
			}else {
				System.out.println("Record not updated:" + i);
			}
			
			conn.close();
	
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}