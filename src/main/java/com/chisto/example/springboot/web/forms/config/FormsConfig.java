package com.chisto.example.springboot.web.forms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource(value = "classpath:aplicacion.properties", encoding = "UTF-8")
})
public class FormsConfig {

}
