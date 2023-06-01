package com.xworkz.fruitproject.dao;

import java.util.LinkedList;

import com.xworkz.fruitproject.dto.FruitDto;



public interface FruitDao {
	
	
	
	public boolean save(FruitDto dto) ;
	public LinkedList<FruitDto> find(String color);
	public LinkedList<FruitDto> remove(String name);
	public LinkedList<FruitDto> update(String name, int price) ;
	public LinkedList<FruitDto> readAll();

}
