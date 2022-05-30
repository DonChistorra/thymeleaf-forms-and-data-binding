package com.chisto.example.springboot.web.forms.model;

import javax.validation.constraints.NotEmpty;

public class Usuario {

	@NotEmpty
	private String username;
	@NotEmpty
	private String password;
	@NotEmpty
	private String email;

	@NotEmpty
	private String identificador;
	
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

}
