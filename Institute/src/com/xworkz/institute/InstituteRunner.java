package com.xworkz.institute;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Set;
import com.xworkz.institute.dto.InstituteDto;
import com.xworkz.institute.service.InstituteService;
import com.xworkz.institute.service.InstituteServiceImpl;


public class InstituteRunner {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.parse("2023-06-14");
		LocalDate date2 = LocalDate.parse("2023-02-23");
		
		
		InstituteService service = new InstituteServiceImpl();
		
		InstituteDto dto1 = new InstituteDto("Xworkz", "Rajajinagara", 100, 28000, 6, date);
		
		InstituteDto dto2 = new InstituteDto("JSpiders", "BTM Layout", 300, 30000, 5, date2);
		
		
		service.save(1, dto1);
	    service.save(2, dto2);
	    
	    System.out.println("-------------------------------------------------------------------");
	    
	    boolean find = service.findByName("Xworkz");
	    System.out.println(find);
	    
	    System.out.println("-------------------------------------------------------------------");
	    
	    boolean update =service.updateByPrice(1,28000);
	    System.out.println(update);
	    
	    System.out.println("-------------------------------------------------------------------");

	    boolean delete = service.deleteByName(2, "JSpiders");
	    System.out.println(delete);
	    
	    System.out.println("-------------------------------------------------------------------");
		
		HashMap<Integer, InstituteDto> result = service.read();
		Set<Integer> set = result.keySet();
		for(Integer integer : set) {
			System.out.println(result.get(integer));
		}
		

	}

}
