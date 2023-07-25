package com.xworkz.amazon.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "amazon")
@Entity
public class AmazonDto {
	
	@Id
	private int id;
	private String name;
	private int age ;
	private long contactNo;
	private String emailAddress;
	private String location;
	private String gender;

}
