package com.xworkz.fruitproject.dao;

import java.util.LinkedList;

import com.xworkz.fruitproject.dto.FruitDto;

public class FruitDaoImpl implements FruitDao {

	LinkedList<FruitDto> list = new LinkedList<FruitDto>();

	public boolean save(FruitDto dto) {
		if (dto != null) {
			list.add(dto);
			System.out.println("Saved");
			return true;
		}
		System.out.println("Failed to save");
		return false;
	}
	
	public LinkedList<FruitDto> find(String color){
		 if(color!=null) {
		    for(FruitDto str: list) {
            if(str.getColor().equals(color));
				 return list;
			 }
		 }
		return null;		
	}
	
	public LinkedList<FruitDto> remove(String fruitName) {
		if(fruitName!=null) {
			for(FruitDto str:list) {
				if(str.getFruitName().equals(fruitName)) {
					System.out.println("Successfully removed");
					return list;				
				}
			}
		}
		System.out.println("Not removed");
		return null;
	}


	public LinkedList<FruitDto> update(String fruitName, int cost) {
		if (fruitName != null ) {
			for(FruitDto fr : list) {
			if(fr.getFruitName().equals(fruitName)) {
			  fr. setCost(cost);
				System.out.println(list);
				return list;
				}
			}
		}
		return null;
	}

	

	public LinkedList<FruitDto> readAll() {
		return list;
	}

	
	
}
