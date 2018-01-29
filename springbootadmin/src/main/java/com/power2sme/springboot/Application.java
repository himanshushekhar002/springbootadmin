package com.power2sme.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class Application {

	public static void main(String args[]) {
		System.setProperty("spring.application.name", "HIM-SPRINGBOOT APP");
		System.setProperty("endpoints.health.sensitive", "false");
		System.setProperty("management.security.enabled", "false");
		//System.setProperty("spring.boot.admin.url","http://localhost:8080");
		SpringApplication.run(Application.class, args);
	}	
}
