package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter //de serilaization
@Getter //getting email and password
@ToString //only for debugginng

// p.l 
public class AuthRequestDTO {
	@NotBlank(message ="email cant be blank")
	@Email(message="invalid email password")
	private String email;
	@NotBlank(message="password id required !!!")
	private String password;
}
