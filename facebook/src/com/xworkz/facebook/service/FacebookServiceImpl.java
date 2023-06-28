package com.xworkz.facebook.service;

import java.sql.SQLException;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import com.xworkz.facebook.dto.FacebookDto;
import com.xworkz.facebook.repository.FacebookRepoImpl;
import com.xworkz.facebook.repository.FacebookRepository;

 

public class FacebookServiceImpl implements FacebookService{
	
	 FacebookRepository repo = new FacebookRepoImpl();
	
	public boolean validateAndSave(FacebookDto dto){
		if(dto.getPhoneNumber()>0 && dto.getPhoneNumber()>=10) {
			
		
		
		ValidatorFactory factory =Validation.buildDefaultValidatorFactory();
		 Validator validator = factory.getValidator();
		   Set<ConstraintViolation<FacebookDto>>  violation= validator.validate(dto);
		   
		   
		   if(violation.isEmpty()) {
				repo.validateAndSave(dto);
				System.out.println("validated and saved ");
				return true;
		   
		   }else {
			   System.out.println(violation);
		   }
		}else {
			System.out.println("phone number is not valid");
		}
		return false;
		
	}

	@Override
	public boolean update(FacebookDto dto, int id) throws ClassNotFoundException, SQLException {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<FacebookDto>> violation = validator.validate(dto);
		if(violation.isEmpty()) {
			repo.update(dto, id);
			System.out.println("Upated successufully");
			return true;
		}else {
			System.out.println(violation);
		}
		return false;
	}

	@Override
	public boolean read() throws ClassNotFoundException, SQLException {
		repo.read();
		return true;
	}

	@Override
	public boolean delete(FacebookDto dto, int id) throws ClassNotFoundException, SQLException {
		if(dto!=null) {
			if(id!=0) {
				System.out.println("deleted successfully");
				repo.delete(dto, id);
			}
		}
		return false;
	}

	@Override
	public boolean updateByEmail(String firstName, String email) throws ClassNotFoundException, SQLException {
		if(firstName!=null) {
			if(email!=null) {
				repo.updateByEmail(firstName, email);
				System.out.println("First name updated");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteByEmail(String email) throws ClassNotFoundException, SQLException {
		if(email!=null) {
			repo.deleteByEmail(email);
			System.out.println("Deleted by email successufully");
		}
		return false;
	}

	@Override
	public boolean readByEmail(String email) throws ClassNotFoundException, SQLException {
		if(email!=null) {
			repo.readByEmail(email);
			System.out.println("Read by email");
		}
		return false;
	}

	

}
