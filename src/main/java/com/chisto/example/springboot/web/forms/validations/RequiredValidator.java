package com.chisto.example.springboot.web.forms.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

public class RequiredValidator implements ConstraintValidator<Required, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(StringUtils.hasText(value)) {
			return true;
		}
		return false;
	}
	
}
