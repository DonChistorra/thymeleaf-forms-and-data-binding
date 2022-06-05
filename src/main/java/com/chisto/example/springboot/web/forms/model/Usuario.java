package com.chisto.example.springboot.web.forms.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.chisto.example.springboot.web.forms.validations.IdentificadorRegex;
import com.chisto.example.springboot.web.forms.validations.Required;

public class Usuario {

	@NotEmpty(message = "Campo username no puede ser nulo")
	@Size(min = 3, max = 8)
	private String username;
	@Required
	private String password;
	@Required
	@Email
	private String email;

	@IdentificadorRegex
	private String identificador;
	
	@NotNull
	@Min(5)
	@Max(40)
	private Integer edad;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
