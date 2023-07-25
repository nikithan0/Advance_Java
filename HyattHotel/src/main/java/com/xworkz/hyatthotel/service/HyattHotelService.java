package com.xworkz.hyatthotel.service;

import java.util.List;

import com.xworkz.hyatthotel.dto.HyattEmployeDto;

public interface HyattHotelService {
	
	public boolean save(HyattEmployeDto dto);
	
	public boolean updateNameById(int id, String name);
	
	public boolean deleteById(int id);
	
	public HyattEmployeDto findByName(String name);
	
	public HyattEmployeDto findById(int id);
	
	public List<HyattEmployeDto> readAll();
	
	

}
