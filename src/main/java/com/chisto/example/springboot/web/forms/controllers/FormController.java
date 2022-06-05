package com.chisto.example.springboot.web.forms.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.chisto.example.springboot.web.forms.model.Usuario;
import com.chisto.example.springboot.web.forms.validations.UsuarioValidator;

@Controller
@SessionAttributes("usuario")
@RequestMapping("/web")
public class FormController {

	@Autowired
	private UsuarioValidator validator;
	
	@Value("${controllers.form.titulo}")
	private String titulo;

	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("titulo", titulo);
		Usuario usuario = new Usuario();
		usuario.setIdentificador("123456");
		model.addAttribute("usuario", usuario);
		return "form";
	}

	@PostMapping("/form")
	public String procesarForm(@Valid Usuario usuario, BindingResult result, Model model) {
		validator.validate(usuario, result);
		model.addAttribute("titulo", titulo);
		if (result.hasErrors()) {
			return "form";
		}
		model.addAttribute("usuario", usuario);
		return "processedForm";
	}
}
