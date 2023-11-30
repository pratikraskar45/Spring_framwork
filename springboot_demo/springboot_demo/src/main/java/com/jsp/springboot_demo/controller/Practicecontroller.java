package com.jsp.springboot_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // to tell ioc container that in this particular class we are going to create rest API
public class Practicecontroller {
	
	@RequestMapping("/print")
	public void print() {
		System.out.println("print api is called");
		
	}
	@RequestMapping("/display")
	public String display() {
		return "display api is called";
		
	}

}
