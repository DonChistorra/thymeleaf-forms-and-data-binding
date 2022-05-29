package com.chisto.example.springboot.web.forms.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chisto.example.springboot.web.forms.model.Usuario;

@Controller
@RequestMapping("/web")
public class FormController {

	@Value("${controllers.form.titulo}")
	private String titulo;

	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("titulo", titulo);
		model.addAttribute("usuario", new Usuario());
		return "form";
	}

	@PostMapping("/form")
	public String procesarForm(@Valid Usuario usuario, BindingResult result, Model model) {

		model.addAttribute("titulo", titulo);
		if (result.hasErrors()) {
			return "form";
		}
		model.addAttribute("usuario", usuario);
		return "processedForm";
	}
}
