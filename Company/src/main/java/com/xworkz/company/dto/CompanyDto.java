package com.xworkz.company.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Table(name="company")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CompanyDto {

	@Id
	private int id;
	private String name;
	private String founder;
	private String products;
	private int numberOfEmployees;
	private String website;
	

}
