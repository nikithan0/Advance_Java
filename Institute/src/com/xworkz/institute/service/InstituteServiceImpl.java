package com.xworkz.institute.service;

import java.util.HashMap;

import com.xworkz.institute.dao.InstituteDaoImpl;
import com.xworkz.institute.dto.InstituteDto;

public class InstituteServiceImpl implements InstituteService{

	InstituteDaoImpl dao = new InstituteDaoImpl();
	
	
	@Override
	public boolean save(Integer id, InstituteDto dto) {
		if(dto!=null) {
			if(dto.getName()!=null && dto.getName().length()>3) {
				if(dto.getLocation()!=null) {
					if(dto.getStudents()!=0) {
						if(dto.getPrice()!=0) {
							dao.save(id, dto);
							System.out.println("Given information are saved");
							return true;		
						}
						System.out.println("Not saved");
						return false;
					}
					System.out.println("Student count is not valid");
					return false;
				}
				System.out.println("Incorrect given location");
				return false;
			}
			System.out.println("The given name is not valid");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}


	@Override
	public boolean findByName(String name) {
		if(name!=null) {
			System.out.println("Name is found");
			return dao.findByName(name);
		}
		System.out.println("Name is null");
		return false;
	}


	@Override
	public boolean updateByPrice(Integer key, int price) {
		if(key!=null) {
			if(price!=0) {
				System.out.println("updated");
				dao.updateByPrice(key, price);
				return true;
			}
			System.out.println("Price is Zero");
			return false;
		}
		System.out.println("Key is null");
		return false;
	}


	@Override
	public boolean deleteByName(Integer key, String name) {
		if(key!=0) {
			if(name!=null) {
				System.out.println("Deleted");
				dao.deleteByName(key, name);
				return true;
			}
			return false;
		}
		System.out.println("The key is null");
		return false;
	}

	@Override
	public HashMap<Integer, InstituteDto> read() {		
		return dao.read();
	}


	
	

}
