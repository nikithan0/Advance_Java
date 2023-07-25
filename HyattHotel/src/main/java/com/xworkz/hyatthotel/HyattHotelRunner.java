package com.xworkz.hyatthotel;

import java.util.Iterator;
import java.util.List;

import com.xworkz.hyatthotel.dto.HyattEmployeDto;
import com.xworkz.hyatthotel.service.HyattHotelService;
import com.xworkz.hyatthotel.service.HyattHotelServiceImpl;

public class HyattHotelRunner {

	public static void main(String[] args) {
	
		HyattEmployeDto dto1 = new HyattEmployeDto(1, "Rose", "rose@gmail.com", 9073654787l, 35,"Female", "Front Desk Clerks", 35000);
		HyattEmployeDto dto2 = new HyattEmployeDto(2, "Patrick", "patrick@gmail.com", 7857908765L, 45, "Male", "Accountant", 30000);
		HyattEmployeDto dto3 = new HyattEmployeDto(3, "Joe", "joemerriam@gmail.com", 7689098763L, 55, "Male", "HouseKeeping", 15000);
		HyattEmployeDto dto4 = new HyattEmployeDto(4, "Lisa", "lisal@gmail.com", 9127846738L, 34, "Female", "Waitress", 23000);
		HyattEmployeDto dto5 = new HyattEmployeDto(5, "Angia Luis", "angial@gmail.com", 9785189090L, 32, "Female", "Chief", 45000);

		HyattHotelService service = new HyattHotelServiceImpl();
		
		//service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
//		service.save(dto5);
		System.out.println("----------------------------------update----------------------------------");
		boolean update = service.updateNameById(4, "Lisa l");
		System.out.println(update);
		
		System.out.println("----------------------------------delete----------------------------------");
	
//		boolean delete = service.deleteById(2);
//		System.out.println(delete);
		
		System.out.println("----------------------------------findByName----------------------------------");

		HyattEmployeDto find = service.findByName("'Angia Luis'");
		System.out.println(find);
		
		System.out.println("----------------------------------findById----------------------------------");

		HyattEmployeDto findById = service.findById(3);
		System.out.println(findById);
		
		System.out.println("----------------------------------read----------------------------------");
		
		List<HyattEmployeDto> list = service.readAll();
		for (HyattEmployeDto li : list) {
			System.out.println(li);
		}
	}

}
