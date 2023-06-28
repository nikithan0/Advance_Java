package com.workz.avtar.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter


public class AvtarDto {
	private int id;
	@NotBlank
	@NotEmpty(message="Name is null")
	@Size (min=3, max=15)
	private String avatar_actors;
	private int age;
	private String dateOfBirth;
	private String Nationality;
	private boolean Marriagestatus;
	private int TotalMovies;
	private String firstMovie;
	private String lastMovie;
	private String CharecterName;

}
