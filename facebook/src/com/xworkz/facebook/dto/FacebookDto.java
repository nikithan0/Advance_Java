package com.xworkz.facebook.dto;

import javax.validation.constraints.Email;
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
@Getter
@Setter
@ToString

public class FacebookDto {

	
	private int id;
	@NotBlank
	@NotEmpty(message ="Name is null")
	@Size(min=3, max=50)
	private String firstName;
	@NotBlank
	@NotEmpty(message ="Name is null")
	@Size(min=3, max=50)
	private String lastName;
	@NotBlank
	@NotEmpty
	private String DOB;
	
	@NotBlank
	@NotEmpty
	@Email(message="Email is null")
	private String email;

	private Long phoneNumber;
	
	@NotBlank
	@NotEmpty(message ="Enter gender")
	private String gender;
	
	@NotBlank
	@Size(min=8, max=16)
	private String  password;
	

}
