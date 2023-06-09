package com.xworkz.studentproject.dto;

public class StudentDto {
	
	private String name;
	private int registerNo;
	private int age;
	private String qualification;
	private String place;
	
	public StudentDto() {
		super();
	}

	public StudentDto(String name, int registerNo, int age, String qualification, String place) {
		super();
		this.name = name;
		this.registerNo = registerNo;
		this.age = age;
		this.qualification = qualification;
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(int registerNo) {
		this.registerNo = registerNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", registerNo=" + registerNo + ", age=" + age + ", qualification="
				+ qualification + ", place=" + place + "]";
	}
	
	

}
