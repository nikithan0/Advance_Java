package com.xworkz.laptop.service;

import java.util.List;

import com.xworkz.laptop.dto.LaptopDto;

public interface LaptopService {

	public boolean save(LaptopDto dto);

	public LaptopDto findById(int id);

	public List<LaptopDto> readAll();

	public boolean update(LaptopDto dto);

	public boolean delete(LaptopDto dto);

	public boolean deleteById(int id);

}
