package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employ;
import com.example.demo.service.EmployService;

@RestController
@RequestMapping(value = "/employ")
public class EmployController {
	
	@Autowired
	private EmployService empService;
	
	@GetMapping(value = "/showEmploy")
	public List<Employ> showEmploy(){
		return empService.showEmploy();
	}
	
	@GetMapping(value = "/searchEmploy/{empno}")
	public Employ searchEmploy(@PathVariable int empno){
		return empService.searchEmploy(empno);
	}

}
