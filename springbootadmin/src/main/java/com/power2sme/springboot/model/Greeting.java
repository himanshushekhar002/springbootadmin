package com.power2sme.springboot.model;

import java.util.UUID;

public class Greeting {

	private String id;
	private String name;
	
	public Greeting(String name) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
}
