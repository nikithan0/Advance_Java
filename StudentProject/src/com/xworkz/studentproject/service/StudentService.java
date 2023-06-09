package com.xworkz.studentproject.service;

import java.util.HashMap;

import com.xworkz.studentproject.dto.StudentDto;

public interface StudentService {
	public boolean save(Integer id, StudentDto dto);
	public StudentDto find(Integer key);
	public HashMap<Integer, StudentDto> readAll();

}
