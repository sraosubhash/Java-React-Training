package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Ash";
	}
	
	@GetMapping(value = "/delete")
	public String deleteMapping() {
		return "This is deleted content...";
	}
	
}
