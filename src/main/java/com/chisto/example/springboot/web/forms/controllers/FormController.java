package com.chisto.example.springboot.web.forms.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chisto.example.springboot.web.forms.model.Usuario;


@Controller
@RequestMapping("/web")
public class FormController {
	
	@Value("${controllers.form.titulo}")
	private String titulo;

	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("titulo", titulo);
		return "form";
	}
	
	@PostMapping("/form")
	public String procesarForm(Model model, 
			@RequestParam String username,
			@RequestParam String password,
			@RequestParam String password_2,
			@RequestParam String email) {
		
		Usuario usuario = new Usuario();
		usuario.setUsername(username);
		usuario.setPassword(password.equals(password_2) ? password : "Las contraseñas no coinciden");
		usuario.setEmail(email);
		
		model.addAttribute("titulo", titulo);
		model.addAttribute("usuario", usuario);
		
		return "processedForm";
	}
}
