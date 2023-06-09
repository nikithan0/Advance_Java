package com.xworkz.studentproject.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DtoRunner {

	public static void main(String[] args) {
		
		List<StudentDto2> obj = new ArrayList<StudentDto2>();
		
		StudentDto2 dto = new StudentDto2("Anisha", 202311, 20, "B.A", "Mangalore");
		StudentDto2 dto2 =  new StudentDto2("Deisy", 202414, 22, "B.Com", "Shirshi");
		StudentDto2 dto3 =  new StudentDto2("Meghana", 202278, 24, "B.SC", "Thirthalli");
		StudentDto2 dto4 =  new StudentDto2("Anni", 202315, 19, "BBA", "Sagar");
		 
		obj.add(dto);
		obj.add(dto2);
		obj.add(dto3);
		obj.add(dto4);
		
		Comparator<StudentDto2> comp = new Comparator<StudentDto2>() {

			@Override
			public int compare(StudentDto2 o1, StudentDto2 o2) {
			if(o1.getAge()>o2.getAge()) {
				return 1;
			}
				return -1;
			}
		};
		
		Collections.sort(obj,comp);
		for(StudentDto2 ref : obj) {
			System.out.println(ref);
		}

	}

}
