package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employ;
import com.example.demo.repo.EmployRepository;

@Service
public class EmployService {
	
	@Autowired
	private EmployRepository empRepository;
	
	public List<Employ> showEmploy(){
		return empRepository.findAll();
	}
	
	public Employ searchEmploy(int empno) {
		return empRepository.findById(empno).get();
	}
	
	public void addEmploy(Employ employ) {
		empRepository.save(employ);
	}
	
	public void updateEmploy(Employ employ) {
		empRepository.save(employ);
	}
	
	public void deleteEmploy(int empno) {
		empRepository.deleteById(empno);
	}

}
