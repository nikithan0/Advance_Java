package com.xworkz.twitter.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="twitter")
@Entity

public class TwitterDto {
	
	@Id
	private int id;
	private String name;
	private String email;
	private long phoneNumber;
	private int age;
	private String dob;
	private String gender;
	
	
	

}
