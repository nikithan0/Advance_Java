package com.xworkz.pizzamax.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.pizzamax.dto.PizzaDto;
import com.xworkz.pizzamax.repository.PizzaRepoImpl;
import com.xworkz.pizzamax.repository.PizzaRepository;

public class PizzaServiceImpl implements PizzaService{

	PizzaRepository repo = new PizzaRepoImpl();
	
	@Override
	public boolean save(PizzaDto dto) {
	ValidatorFactory validate  = Validation.buildDefaultValidatorFactory();
	Validator val = validate.getValidator();
	Set<ConstraintViolation<PizzaDto>> violation = val.validate(dto);
	
	if(violation.isEmpty()) {
		System.out.println("no violation");
		boolean save = repo.save(dto);
		System.out.println(save);
	}else {
		System.out.println("Violation");
		System.out.println(violation);
	}
	
		return false;
	}

	
}
