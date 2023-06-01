package com.xworkz.fruitproject.dao;

import java.util.LinkedList;

import com.xworkz.fruitproject.dto.FruitDto;



public interface FruitDao {
	
	
	
	public boolean save(FruitDto dto) ;
	public LinkedList<FruitDto> find(String color);
	public LinkedList<FruitDto> update(String name, int price) ;
	public boolean remove(String name);
	public LinkedList<FruitDto> readAll();

}
