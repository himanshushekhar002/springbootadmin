package com.power2sme.springboot.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

	@Value("${spring.application.name}")
	private String appName;
	
	@RequestMapping("name")
	public String getAppName() {		
		return appName;
	}
}
