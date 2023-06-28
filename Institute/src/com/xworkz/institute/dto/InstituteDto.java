package com.xworkz.institute.dto;

import java.time.LocalDate;


public class InstituteDto {
	
	private String name;
	private String location;
	private int students;
	private int price;
	private int courses;
	private LocalDate reopen;
	
	
	public InstituteDto() {
		super();
	}


	public InstituteDto(String name, String location, int students, int price, int courses, LocalDate reopen) {
		super();
		this.name = name;
		this.location = location;
		this.students = students;
		this.price = price;
		this.courses = courses;
		this.reopen = reopen;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getStudents() {
		return students;
	}


	public void setStudents(int students) {
		this.students = students;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getCourses() {
		return courses;
	}


	public void setCourses(int courses) {
		this.courses = courses;
	}
	
	public LocalDate getReopen() {
		return reopen;		
	}
	
	public void SetReopen(LocalDate reopen) {
		this.reopen=reopen;
	}
	


	@Override
	public String toString() {
		return "InstituteDto [name=" + name + ", location=" + location + ", students=" + students + ", price=" + price
				+ ", courses=" + courses + ", reopen="+ reopen +"]";
	}
	
	

}
