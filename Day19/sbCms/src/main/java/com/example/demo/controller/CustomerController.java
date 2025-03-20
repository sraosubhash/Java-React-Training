package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService cusService;
	
	@GetMapping(value = "/showCustomer")
	public List<Customer> showCustomer(){
		return cusService.showCustomer();
	}
	
	@GetMapping(value = "/searchCustomer/{cusId}")
	public ResponseEntity<Customer> searchCustomer(@PathVariable int cusId){
		try {
			Customer customer = cusService.serachById(cusId);
			return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(value = "/searchByUserName/{userName}")
	public ResponseEntity<Customer> searchByUserName(@PathVariable String userName){
		try {
			Customer customer = cusService.searchByUserName(userName);
			return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(value="/customerLogin/{cusUserName}/{cusPassword}")
	public String login(@PathVariable String cusUserName,@PathVariable String cusPassword) {
		return cusService.login(cusUserName, cusPassword);
	}

}
