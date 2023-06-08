package com.xworkz.teacherinfo.dao;

import java.util.HashMap;

import com.xworkz.teacherinfo.dto.TeacherDto;

public class TeacherDaoImpl implements TeacherDao {

	HashMap<Integer, TeacherDto> ref = new HashMap<Integer, TeacherDto>();

	@Override
	public boolean save(TeacherDto dto, Integer id) {
		ref.put(id, dto);
		return true;
	}

	@Override
	public TeacherDto findByKey(Integer key) {

		return ref.get(key);

	}

	@Override
	public boolean update(Integer key, String graduation) {
		TeacherDto tt = ref.get(key);
		tt.setGraduation(graduation);
		System.out.println(ref.get(key));
		return true;
	}

	public boolean delete(Integer key) {		
			ref.remove(key);
			System.out.println(ref.get(key));
			return true;
		}

	@Override
	public HashMap<Integer, TeacherDto> readAll() {
		
		return ref;
	}

	
	
		
	

}
