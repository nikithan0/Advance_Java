package com.xworkz.institute.dao;

import java.util.HashMap;
import java.util.Set;

import com.xworkz.institute.dto.InstituteDto;

public class InstituteDaoImpl implements InstituteDao{
	
	HashMap<Integer, InstituteDto> map =new HashMap<Integer, InstituteDto>();

	@Override
	public boolean save(Integer id, InstituteDto dto) {
		map.put(id,dto);	
		return true;
	}
	
	@Override
	public boolean findByName(String name) {
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			InstituteDto dto = map.get(key);
			if(dto.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateByPrice(Integer key, int price) {
		InstituteDto update = map.get(key);
		
		return true;
	}

	@Override
	public boolean deleteByName(Integer key, String name) {
		map.remove(key);
		System.out.println("Deleted successful");
		return true;
	}


	@Override
	public HashMap<Integer, InstituteDto> read() {		
		return map;
	}	
}
