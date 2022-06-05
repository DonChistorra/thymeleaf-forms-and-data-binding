package com.chisto.example.springboot.web.forms.validations;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.chisto.example.springboot.web.forms.model.Usuario;

@Component
public class UsuarioValidator implements Validator {

	private String identificadorRegex = "[0-9]{8}";
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Usuario.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		 Usuario usuario = (Usuario) target;
		 
		 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "user.username.not-empty");
		 
		 if(!usuario.getIdentificador().matches(identificadorRegex)) {
			 errors.rejectValue("identificador", "user.identificador.not-matches-regex");
		 }
	}

}
