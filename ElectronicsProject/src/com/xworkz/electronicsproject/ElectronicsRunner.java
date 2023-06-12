package com.xworkz.electronicsproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.xworkz.electronicsproject.dto.ElectronicsDto;
import com.xworkz.electronicsproject.util.DateComparator;
import com.xworkz.electronicsproject.util.PriceComparator;
import com.xworkz.electronicsproject.util.WarrantyComparator;

public class ElectronicsRunner {

	public static void main(String[] args) {
	
		
		
		ElectronicsDto dto = new ElectronicsDto("Air Conditioner", "White", 28990, 28, 5F);
		ElectronicsDto dto1 = new ElectronicsDto("Fridge", "Blue", 24000, 24, 10F);
		ElectronicsDto dto2 = new ElectronicsDto("Laptop", "Silver", 30000, 30, 3.2F);
		ElectronicsDto dto3 = new ElectronicsDto("Computer", "Black",  17980, 02, 4.4F);
		ElectronicsDto dto4 = new ElectronicsDto("Mobile phone", "Red", 13000, 15, 2.2F);
		ElectronicsDto dto5 = new ElectronicsDto("Washing mashine", "White", 15000, 10, 6F);
		ElectronicsDto dto6 = new ElectronicsDto("Heater", "White", 10000, 13, 1F);
		ElectronicsDto dto7 = new ElectronicsDto("Blender",	"Orange", 6000, 10, 5.3F);
		ElectronicsDto dto8 = new ElectronicsDto("Television", "Black", 30000, 11, 2F);
		ElectronicsDto dto9 = new ElectronicsDto("Digital Camera", "Silver", 39000, 05, 3.5F);
		
		List<ElectronicsDto> list = Arrays.asList(dto, dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9);
		

		PriceComparator pComp = new PriceComparator();
		
		DateComparator dComp = new DateComparator();
		
		WarrantyComparator wComp = new WarrantyComparator();
		
		Collections.sort(list,wComp);
		for (ElectronicsDto eDto : list) {
			System.out.println(eDto);
			
		}
		
	}

}
