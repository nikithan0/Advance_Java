package com.xworkz.pizzamax.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.xworkz.pizzamax.dto.PizzaDto;

public class PizzaRepoImpl implements PizzaRepository{

	@Override
	public boolean save(PizzaDto dto) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza_ delivery", "root", "Xworkzodc@123");
		 
		 String quary ="Insert into pizza_info values(?,?,?,?)";
		 
		 System.out.println(quary);
		 
		 PreparedStatement statement = con.prepareStatement(quary);
		 
		 statement.setString(1, dto.getPizzaName());
		 statement.setString(2, dto.getType());
		 statement.setString(3, dto.getLocation());
		 statement.setString(4, dto.getPaymentMode());
		 
		 int i = statement.executeUpdate();
		 if(i>0) {
		 System.out.println("Data is saved");
		 return true;
		 }else {
			 System.out.println("Data is not saved");
		 }
		 
		 con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
