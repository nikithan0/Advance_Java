package com.xworkz.hyatthotel.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="hotel_employeInfo")
@Entity

public class HyattEmployeDto {
	
	@Id
	private int id;
	private String name;
	private String email;
	private long number;
	private int age;
	private String gender;
	private String job;
	private int salary;	
}
