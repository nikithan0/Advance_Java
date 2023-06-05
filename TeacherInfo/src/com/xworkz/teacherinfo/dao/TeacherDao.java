package com.xworkz.teacherinfo.dao;

import com.xworkz.teacherinfo.dto.TeacherDto;

public interface TeacherDao {
	public boolean save(TeacherDto dto, Integer id);
	
	public TeacherDto findByKey(Integer key);
	
	public boolean update(Integer key, String graduation);
	
	public boolean delete(Integer key);
	//public TeacherDto read();
}
