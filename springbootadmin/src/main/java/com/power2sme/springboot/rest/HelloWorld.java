package com.power2sme.springboot.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.power2sme.springboot.model.Greeting;

@RestController
public class HelloWorld {

	@Value("${spring.application.name}")
	private String appName;
	
	@RequestMapping("/greet")
	public Greeting greet(@RequestParam("name") String name) {
		return new Greeting(name);
	} 
	
	@RequestMapping("/greets")
	public List<Greeting> greets(@RequestParam("name") String name, @RequestParam("n") int n) {
		List<Greeting> list = new ArrayList<Greeting>();
		for(int i=0;i<n;i++) {
			list.add(new Greeting(name+"-"+i));
		}
		return list;
	}
	
	@RequestMapping("/app")
	public String getAppName() {		
		return appName;
	}
}
