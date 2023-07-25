package com.xworkz.amazon;

import java.util.List;

import com.xworkz.amazon.dto.AmazonDto;
import com.xworkz.amazon.service.AmazonService;
import com.xworkz.amazon.service.AmazonServiceImpl;

public class AmazonRunner {

	public static void main(String[] args) {
	 
		AmazonDto dto1 = new AmazonDto(1, "Pallavi", 23, 9087837890L, "pallavi@gmail.com", "Shivamoga", "Female");
		AmazonDto dto2 = new AmazonDto(2, "Ashwini", 22, 7809878679L, "ashwini@gamil.com", "Hosanagara", "Female");
		AmazonDto dto3 = new AmazonDto(3, "Sheela", 24, 7647389828L, "sheela@gmail.com", "Belagum", "Female");
		AmazonDto dto4 = new AmazonDto(4, "Karan", 23, 7893267813L, "karan@gmail.com", "Hosur", "Male");
		
		AmazonService service = new AmazonServiceImpl();
		
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
		
		System.out.println("------------------------------------------findById------------------------------------------");
		
		AmazonDto find = service.findById(1);
		System.out.println(find);
		
		System.out.println("------------------------------------------ findByName------------------------------------------");
		
		AmazonDto findName = service.findByName("'Pallavi'");
		System.out.println(findName);
		
		System.out.println("------------------------------------------updateById------------------------------------------");
		
		boolean updateById = service.updateById(2, "Ashwini H.S");
		System.out.println(updateById);
		
		System.out.println("------------------------------------------updateByNameId------------------------------------------");
		
		boolean updateByNameId = service.updateByNameId(2, "'Ashwini H.S'", "Udupi");
		System.out.println(updateByNameId);

		System.out.println("------------------------------------------deleteById------------------------------------------");
		
		//service.deleteById(4);
		
		System.out.println("------------------------------------------readAll------------------------------------------");
		
		List<AmazonDto> list = service.readAll();
		for(AmazonDto li : list) {
			System.out.println(li);
		}
		
	}

}
