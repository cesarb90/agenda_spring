package br.com.fuctura.aula3.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.fuctura.IBinario;
import br.com.fuctura.IBinarioImpl;

@Configuration
public class Config {
	
	@Bean
	public IBinario getBinario() {
		return new IBinarioImpl();
	}
	
}
