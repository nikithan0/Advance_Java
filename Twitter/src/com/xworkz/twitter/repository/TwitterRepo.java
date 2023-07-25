package com.xworkz.twitter.repository;

import java.util.List;

import com.xworkz.twitter.dto.TwitterDto;

public interface TwitterRepo {

	public boolean save(TwitterDto dto);
	
	public TwitterDto findByName(String name);
	
	public TwitterDto updateAgeByName(String name, int age);
	
	public TwitterDto updateByName(String name, String email, int age);
	
	public List<TwitterDto> readAll();
}
