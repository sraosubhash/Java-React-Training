package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	private CustomerRepository cusRepository;
	
	public List<Customer> showCustomer(){
		return cusRepository.findAll();
	}
	
	public Customer serachById(int cusId) {
		return cusRepository.findById(cusId).get();
	}
	
	public Customer searchByUserName(String userName) {
		return cusRepository.findBycusUserName(userName);
	}
	
	public String login(String cusUserName, String cusPassword) {
		long count = cusRepository.countByCusUserNameAndCusPassword(cusUserName, cusPassword);
		String res="";
		res+=count;
		return res;
	}

}
