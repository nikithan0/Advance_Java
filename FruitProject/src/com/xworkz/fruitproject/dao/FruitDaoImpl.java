package com.xworkz.fruitproject.dao;

import java.util.Iterator;
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

	public LinkedList<FruitDto> find(String color) {
		if (color != null) {
			for (FruitDto str : list) {
				if (str.getColor().equals(color));
					
				return list;
			}
		}
		return null;
	}

	

	public LinkedList<FruitDto> update(String fruitName, int cost) {
		if (fruitName != null) {
			for (FruitDto fr : list) {
				if (fr.getFruitName().equals(fruitName)) {
					fr.setCost(cost);
					System.out.println("Cost updated");
					return list;
				}
			}
		}
		return null;
	}
	
	public boolean remove(String fruitName) {
		if (fruitName != null) {

			Iterator<FruitDto> itr = list.iterator();

			while (itr.hasNext()) {
				FruitDto fruit = (FruitDto) itr.next();
				if (fruit.getFruitName() != null) {
					if (fruit.getFruitName().equals(fruitName)) {
						itr.remove();
						System.out.println("Name is deleted");
						return true;
					}
				}
			}
		}
		System.out.println("Not deleted");
		return false;
	}

	public LinkedList<FruitDto> readAll() {
		return list;
	}
}
