package com.example.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modle.Employ;
import com.example.demo.service.EmployService;

@RefreshScope
@RestController
public class EmployController {
	
	@Autowired
	   EmployService employeeService;

	   @RequestMapping("/employ/find/{id}")
	   public Employ findById(@PathVariable Long id){
	      return employeeService.findById(id);
	   }

	   @RequestMapping("/employ/findall")
	   public Collection<Employ> findAll(){
	      return employeeService.findAll();
	   }

}
