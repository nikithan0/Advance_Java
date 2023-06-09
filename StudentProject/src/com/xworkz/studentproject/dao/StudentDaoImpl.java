package com.xworkz.studentproject.dao;

import java.util.HashMap;

import com.xworkz.studentproject.dto.StudentDto;

public class StudentDaoImpl implements StudentDao {
	
	HashMap<Integer , StudentDto > obj = new HashMap<Integer , StudentDto >();
	
	public boolean save(Integer id, StudentDto dto) {
		obj.put(id, dto);
		return true;
		
	}
	public StudentDto find(Integer key) {
		return obj.get(key);
		
	}
	public HashMap<Integer, StudentDto> readAll(){
		return obj;
	}

}
