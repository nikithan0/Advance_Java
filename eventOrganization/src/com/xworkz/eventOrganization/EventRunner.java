package com.xworkz.eventOrganization;

import com.xworkz.eventOrganization.dto.EventDto;
import com.xworkz.eventOrganization.service.EventService;
import com.xworkz.eventOrganization.service.EventServiceImpl;


public class EventRunner {

	public static void main(String[] args) {
	
		EventDto dto = new EventDto();
		
//		dto.setId(1);
//		dto.setEvent_name("School function");
//		dto.setOrganizedBy("Pallavi");
//		dto.setConductedBy("Sheela");
//		dto.setLocation("Shivamoga");
//		dto.setDate("30-6-23");
//		dto.setTime("11.00 a.m");
//		dto.setSpecial_guest("Ramya Gundal");
//		dto.setExpected_peoples(900);
//		dto.setTotal_peoples(790);
//		dto.setEventPrice(1000000);
//		dto.setEmailId("governmenfirstgrade@gmail.com");
//		dto.setPhoneNumber(6790287642L);
//		dto.setTotalEvents(5);
//		dto.setDuration("5 hrs");
		
		
		

		EventService service = new EventServiceImpl();
		//service.validateAndSave(dto);
		//service.updateById(2000);
		//service.updateByName("Manglore");
		service.updateEmail("holiorganization@gmail.com");
		
		dto.setId(3);
		dto.setEvent_name("Scienc&Skils Execution");
		dto.setOrganizedBy("Prerana");
		dto.setConductedBy("Preethi");
		dto.setLocation("Mandya");
		dto.setDate("26-7-23");
		dto.setTime("8.30 a.m");
		dto.setSpecial_guest("Anil N");
		dto.setExpected_peoples(4500);
		dto.setTotal_peoples(3250);
		dto.setEventPrice(200000);
		dto.setEmailId("scienceandskillsorg@gmail.com");
		dto.setPhoneNumber(9002891802L);
		dto.setTotalEvents(5);
		dto.setDuration("7 hrs");
		
		service.updateByDto(dto, 3);
		
		System.out.println("--------------------5 fields--------------------------");
		
		
		service.updating("Navya", "Vinanthi", "Tumkur", "5-7-23", "9.00 a.m");
		

	}

}
