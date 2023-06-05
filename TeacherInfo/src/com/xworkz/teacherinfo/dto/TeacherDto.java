package com.xworkz.teacherinfo.dto;

public class TeacherDto {
	
	private String name;
	private int age;
	private String emailId;
	private String address;
	private String graduation;
	
	public TeacherDto() {
		super();		
	}

	public TeacherDto(String name, int age, String emailId, String address, String graduation) {
		super();
		this.name = name;
		this.age = age;
		this.emailId = emailId;
		this.address = address;
		this.graduation = graduation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	@Override
	public String toString() {
		return "TeacherDto [name=" + name + ", age=" + age + ", emailId=" + emailId + ", address=" + address
				+ ", graduation=" + graduation + "]";
	}
	
	
	
	
	
	
	
	

}
