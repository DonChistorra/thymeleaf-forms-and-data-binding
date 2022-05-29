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
	public String procesarForm(Usuario usuario, Model model) {
		
		model.addAttribute("titulo", titulo);
		model.addAttribute("usuario", usuario);
		
		return "processedForm";
	}
}
