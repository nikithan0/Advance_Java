package com.xworkz.cosmetics.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.cosmetics.dto.CosmeticsDto;
import com.xworkz.cosmetics.repositoy.CosmeticsRepoImpl;
import com.xworkz.cosmetics.repositoy.CosmeticsRepository;

public class CosmeticsServiceImpl implements CosmeticsService{

	CosmeticsRepository repo = new CosmeticsRepoImpl();
	@Override
	public boolean save(CosmeticsDto dto) {
	  ValidatorFactory validation = Validation.buildDefaultValidatorFactory();
	  Validator val = validation.getValidator();
	  Set<ConstraintViolation<CosmeticsDto>> violation = val.validate(dto);
	  
	  if(violation.isEmpty()) {
		  System.out.println("No violation");
		  boolean save = repo.save(dto);
		  System.out.println(save);
		  return true;
	  }else {
		  System.out.println("Violation");
		  System.out.println(violation);
	  }
		return false;
	}
	@Override
	public boolean findByFirstName(String firstName) {
		if(firstName!=null) {
			boolean found = repo.findByFirstName(firstName);
			System.out.println(found);
			return true;
		}
		
		return false;
	}
	

}
