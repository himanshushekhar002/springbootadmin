package com.power2sme.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class Application extends SpringBootServletInitializer {

	
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    		configureSystemProperties();
        return application.sources(Application.class);
    }
	
	public static void main(String args[]) {	
		configureSystemProperties();
		SpringApplication.run(Application.class, args);
	}	
	
	private static void configureSystemProperties() {
		System.setProperty("spring.application.name", "HIM-SPRINGBOOT APP");
		System.setProperty("spring.boot.admin.context-path", "/admin");
	}
	
}
