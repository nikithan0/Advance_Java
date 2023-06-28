package com.xworkz.institute.dao;

import java.util.HashMap;

import com.xworkz.institute.dto.InstituteDto;

public interface InstituteDao {

	public boolean save(Integer id, InstituteDto dto);

	public boolean findByName(String name);

	public boolean updateByPrice(Integer key, int price);

	public boolean deleteByName(Integer key, String name);

	public HashMap<Integer, InstituteDto> read();

}
