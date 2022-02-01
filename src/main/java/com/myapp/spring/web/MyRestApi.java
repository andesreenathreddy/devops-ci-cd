package com.myapp.spring.web;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyRestApi {
	@GetMapping
	@RequestMapping("/api/v1")
	public String sayHello() {
		
		return "Welcome To World of Rest Api with java spring and current Date"
				+LocalDate.now();
		
	}
	

}
