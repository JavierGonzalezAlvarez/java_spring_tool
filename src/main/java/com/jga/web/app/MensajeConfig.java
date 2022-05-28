package com.jga.web.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource("classpath:mensajes.properties"),
	//if we need more files
	//@PropertySource("classpath:textos.properties"),
})
public class MensajeConfig {

}
