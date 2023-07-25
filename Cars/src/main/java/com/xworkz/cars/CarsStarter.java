package com.xworkz.cars;

import java.util.Iterator;
import java.util.List;

import com.xworkz.cars.dto.CarsDto;
import com.xworkz.cars.service.CarsService;
import com.xworkz.cars.service.CarsServiceImpl;

public class CarsStarter {

	public static void main(String[] args) {
		
		CarsDto dto1 = new CarsDto(1, "Audi Q3", "Black Metallic", 45.65, 5, "Petrol");
		CarsDto dto2 = new CarsDto(2, "Audi A4", "Red Metallic", 51.85, 5, "Petrol");
		CarsDto dto3 = new CarsDto(3, "Audi Q7", "White Solid", 84.70, 7, "Petrol");
		CarsDto dto4 = new CarsDto(4, "Audi A6", "Silver Metallic", 61.51, 5, "Petrol");
		
		CarsService service = new CarsServiceImpl();
		
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
		
		System.out.println("-------------------------------------findById-------------------------------------");
		
		CarsDto find = service.findById(1);
		System.out.println(find);
		
		System.out.println("-------------------------------------findByName-------------------------------------");

		CarsDto findByName =service.findByName("'Audi Q3'");
		System.out.println(findByName);
		
		System.out.println("-------------------------------------updateById-------------------------------------");

		boolean updateName = service.updateById(4, "AudiQ5");
		System.out.println(updateName);
		
		System.out.println("-------------------------------------updateByNameAndId-------------------------------------");

		boolean update =service.updateByNameId(2, "'Audi A4'", "Navarra Blue Metallic");
		System.out.println(update);
		
		System.out.println("-------------------------------------deleteByName-------------------------------------");

//		boolean delete = service.deleteById(3);
//		System.out.println(delete);
		
		System.out.println("-------------------------------------readAll-------------------------------------");

		List<CarsDto> list = service.readAll();
		for (CarsDto car : list) {
			System.out.println(car);
		}
		
	}

}
