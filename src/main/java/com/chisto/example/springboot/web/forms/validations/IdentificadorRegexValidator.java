package com.chisto.example.springboot.web.forms.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IdentificadorRegexValidator implements ConstraintValidator<IdentificadorRegex, String>{

	private String identificadorRegex = "[0-9]{8}";
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if(!value.matches(identificadorRegex)) {
			return false;
		}
		return true;
	}

}
