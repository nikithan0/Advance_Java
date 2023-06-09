package com.xworkz.apps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import com.xworkz.apps.dto.SocialMediaDto;

public class Runner extends  SocialMediaDto {

	public static void main(String[] args) {
		
	List<SocialMediaDto> list = new ArrayList< SocialMediaDto>();
		
	SocialMediaDto obj = new  SocialMediaDto("Instagram","Kevin Systrom", 2010, 4.2F);
	SocialMediaDto obj1 =new  SocialMediaDto("Facebook", "Mark Zuckerbug", 2004, 4.1F);
	SocialMediaDto obj2 =new  SocialMediaDto("WhatsApp","Jan Koum", 2009, 4.1F);
	SocialMediaDto obj3 =new  SocialMediaDto("Twitter","Jack Dorsey", 2006, 4.2F);
	
	list.add(obj);
	list.add(obj1);
	list.add(obj2);
	list.add(obj3);
	
	Collections.sort(list);
	for(SocialMediaDto dto : list) {
		System.out.println(dto);
	}
	
		
		

	}

}
