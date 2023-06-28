package com.xworkz.facebook;

import java.sql.SQLException;

import com.xworkz.facebook.dto.FacebookDto;
import com.xworkz.facebook.service.FacebookService;
import com.xworkz.facebook.service.FacebookServiceImpl;

public class FacebookRunner {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		FacebookDto dto = new FacebookDto();
		
		dto.setId(4);
		dto.setFirstName("Pallavi");
		dto.setLastName("Pallavi S");
		dto.setDOB("26-12-2001");
		dto.setEmail("pallavi@gamail.com");
		dto.setPhoneNumber(9088742123L);
		dto.setGender("Female");
		dto.setPassword("1432756781");
		
		FacebookService service = new FacebookServiceImpl();
//		service.validateAndSave(dto);
		//service.update(dto, 2);
		service.read();
		//service.delete(dto, 2);
		System.out.println("----------update by email-----------");
		service.updateByEmail("Pallavi S", "pallavi@gamail.com");
		
		System.out.println("----------delete by email-----------");
		service.deleteByEmail("nancyl@gamail.com");
		
		System.out.println("----------read by email-----------");
		service.readByEmail("pallavi@gamail.com");
		
		 

	}

}
