package com.xworkz.teacherinfo;


 
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.xworkz.teacherinfo.dto.TeacherDto;
import com.xworkz.teacherinfo.service.TeacherService;
import com.xworkz.teacherinfo.service.TeacherServiceImpl;

public class Runner {

	public static void main(String[] args) {
		
		TeacherService service = new TeacherServiceImpl();
		
		TeacherDto dto = new TeacherDto("Anisha", 34, "anisha@gmail.com", "Shirshi", "B.Ed");
		TeacherDto dto1 = new TeacherDto("Anitha", 30, "anitha@gmail.com", "Shivamoga", "M.Sc");
		TeacherDto dto2 = new TeacherDto("Bhavya", 36, "bhavya@gmail.com", "Thithalli", "B.Ed");
		TeacherDto dto3 = new TeacherDto("Jenifer", 29, "jenifer@gmail.com", "Sagara", "B.A");
		TeacherDto dto4 = new TeacherDto("Deisy", 27, "deisy@gmail.com", "Chikamagaluru", "B.Sc");
		
		
		service.save(dto, 101);
		service.save(dto1, 102);
		service.save(dto2, 103);
		service.save(dto3, 104);
		service.save(dto4, 105);
		
		System.out.println("----------------------find-----------------------------");
		
		TeacherDto find = service.findByKey(103);
		System.out.println(find);
		
		System.out.println("----------------------update-----------------------------");
		
		boolean updat = service.update(104, "B.Sc");
		System.out.println(updat);
		
		System.out.println("----------------------delete-----------------------------");
		
		boolean delete = service.delete(103);
		System.out.println(delete);
		
		System.out.println("----------------------read-----------------------------");
		
		HashMap<Integer, TeacherDto> result= service.readAll();
		Set<Entry<Integer,TeacherDto>> re = result.entrySet();
		for(Entry<Integer, TeacherDto> i : re) {
		System.out.println(i);
			
		}
		
		

	}

}
