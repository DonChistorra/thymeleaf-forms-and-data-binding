package com.chisto.example.springboot.web.forms.validations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = RequiredValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface Required {
	String message() default "{validator.field.required}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
