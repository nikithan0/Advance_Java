package com.xworkz.laptop.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="Laptops")
@Entity

public class LaptopDto {
	
	@Id
	private int id;
	private String name;
	private String color;
	private int price;
	private String processor;
	private String storage;
	private float weight;

}
