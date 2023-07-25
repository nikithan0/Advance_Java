package com.xworkz.cars.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "audi_carscollection")
@Entity

public class CarsDto {
	
	@Id
	private int id;
	private String name;
	private String color;
	private double price;
	private int seatingCapacity;
	private String fuel;
	

}
