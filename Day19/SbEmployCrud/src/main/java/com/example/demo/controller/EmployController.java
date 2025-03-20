package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ResponseEntity<Employ> searchEmploy(@PathVariable int empno) {
		try {
			Employ employ = empService.searchEmploy(empno);
			return new ResponseEntity<Employ>(employ,HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Employ>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PostMapping(value = "/addEmploy")
	public void addEmploy(@RequestBody Employ employ) {
		empService.addEmploy(employ);
	}
	
	@PutMapping(value = "/updateEmploy")
	public void updateEmploy(@RequestBody Employ employ) {
		empService.updateEmploy(employ);
	}
	
	@DeleteMapping(value = "/deleteEmploy/{empno}")
	public void deleteEmploy(@PathVariable int empno) {
		empService.deleteEmploy(empno);
	}

}
