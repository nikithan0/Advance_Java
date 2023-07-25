package com.xworkz.cars.repository;

import java.util.List;

import com.xworkz.cars.dto.CarsDto;

public interface CarsRepo {
	
	public boolean save(CarsDto dto);
	
	public CarsDto findById(int id);
	
	public CarsDto findByName(String name);
	
	public boolean updateById(int id, String name);
	
	public boolean updateByNameId(int id, String name, String color);
	
	public boolean deleteById(int id);
	
	public List<CarsDto> readAll();
	

}
