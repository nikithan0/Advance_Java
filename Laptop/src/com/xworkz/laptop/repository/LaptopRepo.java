package com.xworkz.laptop.repository;

import java.util.List;

import com.xworkz.laptop.dto.LaptopDto;

public interface LaptopRepo {
	
	public boolean save(LaptopDto dto);

	public LaptopDto findById(int id);
	
	public List<LaptopDto> readAll();
	
	public boolean updateByName(String name);
	
	public boolean update(LaptopDto dto);
	
	public boolean delete(LaptopDto dto);
	
	public boolean deleteById(int id);
	
}
