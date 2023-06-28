package com.workz.avtar.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.workz.avtar.dto.AvtarDto;
import com.workz.avtar.repository.AvtarRepoImpl;
import com.workz.avtar.repository.AvtarRepository;

public class AvtarServiceImpl implements AvtarService {
    
	 AvtarRepository repo = new AvtarRepoImpl();
	
	@Override
	public boolean validateAndSave(AvtarDto dto) {
		
		
		
	ValidatorFactory factory =Validation.buildDefaultValidatorFactory();
	 Validator validator = factory.getValidator();
	   Set<ConstraintViolation<AvtarDto>>  violation= validator.validate(dto);
	   
	   if(violation.isEmpty()) {
			repo.save(dto);
			System.out.println("validated and saved ");
			return true;
		   
	   }else {
		   System.out.println(violation);
	   }
	return false;
		
		
	
	}

	@Override
	public boolean update(AvtarDto dto, int id) {
		if(dto!=null) {
			if(id!=0) {
				repo.update(dto, id);
				System.out.println("Updated");
			}
		}
		return false;
	}

}
