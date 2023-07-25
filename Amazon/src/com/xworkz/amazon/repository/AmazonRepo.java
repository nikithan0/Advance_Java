package com.xworkz.amazon.repository;

import java.util.List;

import com.xworkz.amazon.dto.AmazonDto;


public interface AmazonRepo {
	
  public boolean save(AmazonDto dto);
	
	public AmazonDto findById(int id);
	
	public AmazonDto findByName(String name);
	
	public boolean updateById(int id, String name);
	
	public boolean updateByNameId(int id, String name, String location);
	
	public boolean deleteById(int id);
	
	public List<AmazonDto> readAll();

}
