package com.xworkz.cosmetics.dto;

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
public class CosmeticsDto {
	
	
	@NotBlank
	@NotEmpty
	@Size(min=2, max=45)
	private String firstName;
	@NotBlank
	@NotEmpty
	private String lastName;
	@NotBlank
	@NotEmpty
	@Email(message="email is not valid")
	private String email;
	@NotBlank
	@NotEmpty
	
	private String age;
	@NotBlank
	@NotEmpty
	private String phoneNumber;
	@NotBlank
	@NotEmpty
	private String location;
	@NotBlank
	@NotEmpty
	
	private String pincode;
	@NotBlank
	@NotEmpty
	private String productName;//dropdown
	@NotBlank
	@NotEmpty
	private String quantity;//dropdown
	@NotBlank
	@NotEmpty
	private String payment;//dropdown

}
