package com.xworkz.studentproject;

import java.util.HashMap;
import java.util.Set;

import com.xworkz.studentproject.dto.StudentDto;
import com.xworkz.studentproject.service.StudentService;
import com.xworkz.studentproject.service.StudentServiceImpl;


public class RunnerClass {

	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImpl();
		
		StudentDto dto = new StudentDto("Anisha", 202311, 20, "B.A", "Mangalore");
		StudentDto dto2 =  new StudentDto("Deisy", 202414, 22, "B.Com", "Shirshi");
		StudentDto dto3 =  new StudentDto("Meghana", 202278, 24, "B.SC", "Thirthalli");
		StudentDto dto4 =  new StudentDto("Anni", 202315, 19, "BBA", "Sagar");
		
		service.save(201, dto);
		service.save(202, dto2);
		service.save(203, dto3);
		service.save(204, dto4);
		
		System.out.println("------------------------------------find----------------------------------------");
		
		StudentDto find = service.find(203);
		System.out.println(find);
		
	
		
		System.out.println("------------------------------------read----------------------------------------");
		
		HashMap<Integer, StudentDto> result = service.readAll();
		Set<Integer> set = result.keySet();
		for(Integer ref : set) {
	
		System.out.println(result.get(ref));
		}
		
		
	

	}

}
