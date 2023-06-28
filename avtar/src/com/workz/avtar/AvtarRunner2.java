package com.workz.avtar;

import com.workz.avtar.dto.AvtarDto;
import com.workz.avtar.service.AvtarService;
import com.workz.avtar.service.AvtarServiceImpl;


public class AvtarRunner2 {

	public static void main(String[] args) {
	
		AvtarDto dto = new AvtarDto();
		
		dto.setId(14);
		dto.setAvatar_actors("D");
		dto.setAge(24);
		dto.setDateOfBirth("23 Sep");
		dto.setNationality("U.S");
		dto.setMarriagestatus(false);
		dto.setTotalMovies(15);
		dto.setFirstMovie("Avtar");
		dto.setLastMovie("Frozen");
		dto.setCharecterName("Elsa");
		
		AvtarService service = new AvtarServiceImpl();
		service.validateAndSave(dto);
		
		//service.update(dto, 12);
		
		
 }
}