package com.xworkz.fruitproject;

import java.util.LinkedList;

import com.xworkz.fruitproject.dao.FruitDao;
import com.xworkz.fruitproject.dao.FruitDaoImpl;
import com.xworkz.fruitproject.dto.FruitDto;

public class RunnerClass {

	public static void main(String[] args) {
	
		FruitDao dao= new FruitDaoImpl();
		
		FruitDto dto = new FruitDto("Mango", "Yellow", "Oval", 100, 1);
		FruitDto dto2 = new FruitDto("Apple", "Red", "Round", 120, 2);
		FruitDto dto3 = new FruitDto("Grapes", "Green", "Oval", 140, 1);
	
		dao.save(dto);
		dao.save(dto2);
		dao.save(dto3);
		
		System.out.println("----------------find------------------");
		
		LinkedList<FruitDto> fr = dao.find("Yellow");
		System.out.println(fr);
		
		System.out.println("----------------set------------------");
		
		LinkedList<FruitDto> fr2 = dao.update("Apple", 130);
		System.out.println(fr2);
		
        System.out.println("----------------remove------------------");
		
		boolean fr1 = dao.remove("Apple");
		System.out.println(fr1);
		
		
		System.out.println("----------------read------------------");
		
		LinkedList<FruitDto> reading = dao.readAll();
		for(FruitDto str: reading) {
			System.out.println(str);
			
		}
		
		

	}

}
