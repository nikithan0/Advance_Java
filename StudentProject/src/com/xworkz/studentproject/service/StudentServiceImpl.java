package com.xworkz.studentproject.service;

import java.util.HashMap;

import com.xworkz.studentproject.dao.StudentDaoImpl;
import com.xworkz.studentproject.dto.StudentDto;

public class StudentServiceImpl implements StudentService {
	
	StudentDaoImpl dao = new StudentDaoImpl();
	
	public boolean save(Integer id, StudentDto dto) {
		if(dto!=null) {
			if(dto.getName()!=null) {
				if(dto.getName().length()>3) {
					if(dto.getAge()>14) {
						if(dto.getQualification()!=null) {
							if(dto.getPlace()!=null) {
								dao.save(id, dto);
								System.out.println("Given information are saved");
								return true;
								
							}
							System.out.println("The place is null & the informations are not saved");
							return false;
						}
						System.out.println("The qualification is null");
						return false;
					}
					System.out.println("The age is less than 14, the age should be +14");
					return false;
				}		
				System.out.println("The lengthof name is not valid");
				return false;
				
			}
			System.out.println("The name is null");
			return false;
		}
		System.out.println("The given dto is null");
		return false;
		
	}
	public StudentDto find(Integer key) {
		if(key!=0) {
			return dao.find(key);
		}
		return null;
		
	}
	public HashMap<Integer, StudentDto> readAll(){
		return dao.readAll();
		
	}

}
