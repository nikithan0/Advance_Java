package com.xworkz.laptop;

import java.util.List;

import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.service.LaptopService;
import com.xworkz.laptop.service.LaptopServiceImpl;

public class LaptopRunner {

	public static void main(String[] args) {

		LaptopDto dto = new LaptopDto(1, "Hp", "Silver", 52655, "intel corre i5 11th Gen", "512 GB", 1.69f);
		LaptopDto dto1 = new LaptopDto(2, "Dell", "Black", 45090, "intel corre i3 11th Gen", "512 GB", 1.8f);
		LaptopDto dto2 = new LaptopDto(3, "Lenevo", "Silver", 34990, "intel core i3 11th Gen", "510 GB", 1.8f);
		LaptopDto dto3 = new LaptopDto(4, "Samsung Galaxy", "Black", 58990, "intel core i5 12th Gen", "512GB", 1.57f);

		LaptopService service = new LaptopServiceImpl();

//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//     	service.save(dto3);

//		boolean update = service.update(dto2);
//		System.out.println(update);
//		
		System.out.println("----------------------------------------------------------");

		boolean deleting = service.delete(dto3);
		System.out.println(deleting);

		System.out.println("----------------------------------------------------------");

		boolean delete = service.delete(dto1);
		System.out.println(delete);

		System.out.println("----------------------------------------------------------");

		LaptopDto finding = service.findById(2);
		System.out.println(finding);

		System.out.println("----------------------------------------------------------");

		List<LaptopDto> list = service.readAll();
		list.forEach((li) -> System.out.println(li));

	}

}
