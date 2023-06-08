package com.xworkz.teacherinfo.service;

import java.util.HashMap;


import com.xworkz.teacherinfo.dao.TeacherDaoImpl;
import com.xworkz.teacherinfo.dto.TeacherDto;

public class TeacherServiceImpl implements TeacherService {

	TeacherDaoImpl dao = new TeacherDaoImpl();

	@Override
	public boolean save(TeacherDto dto, Integer id) {
		if (dto != null) {
			if (dto.getName() != null) {
				if (dto.getEmailId() != null) {
					if (dto.getEmailId().length() > 5) {
						if (dto.getAddress() != null) {
							if (dto.getGraduation() != null) {
								dao.save(dto, id);
								System.out.println("Given informations are saved");
								return true;
							}
							System.out.println("The given graduation name is null");
							return false;
						}
						System.out.println("The address is null");
						return false;
					}
					System.out.println("The length of email id is not valid, give a valid email id");
					return false;

				}
				System.out.println("Email Id is null");
				return false;
			}
			System.out.println("The given name is not valid");
			return false;
		}
		System.out.println("The dto is null");
		return false;
	}

	@Override
	public TeacherDto findByKey(Integer key) {
		if (key != 0) {

			return dao.findByKey(key);
		}
		return null;
	}

	public boolean update(Integer key, String qualification) {
		if (key != 0) {
			if (qualification != null) {
				dao.update(key, qualification);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(Integer key) {
		if (key != 0) {
			System.out.println("The given key is vaalid");
			dao.delete(key);
			
			return true;
		}
		return false;
	}

	@Override
	public HashMap<Integer, TeacherDto> readAll() {
		
		return dao.readAll();
	}

	
	

}