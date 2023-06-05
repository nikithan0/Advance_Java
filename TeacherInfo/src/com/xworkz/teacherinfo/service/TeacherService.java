package com.xworkz.teacherinfo.service;

import com.xworkz.teacherinfo.dto.TeacherDto;

public interface TeacherService {

	public boolean save(TeacherDto dto,  Integer id);
	public TeacherDto findByKey(Integer key);
	public boolean update(Integer key, String qualification);
	public boolean delete(Integer key);
	
}
