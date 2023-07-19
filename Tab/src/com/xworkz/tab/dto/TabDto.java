package com.xworkz.tab.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table (name= "tab")
@Entity

public class TabDto {
	
	@Id
	private int id; 
	private String name;
	private String color;
	private int price;
	private String camera;
	private String storage;
	private int ram;
	
	

}
