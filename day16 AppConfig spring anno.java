package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean
	//@Scope("prototype")
	public Employee getEmployee() {
		return new Employee();
		}
	
	@Bean
	public Address getAddress() {
		return new Address();
		}
}
