package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employ;
import com.example.demo.repo.EmployRepository;

@Service
public class EmployService {
	
	@Autowired
	private EmployRepository empRepository;
	
	public Page<Employ> findAll(int pageNo, int pageSize, String sortBy, String sortDirection){
		Sort sort = Sort.by(Sort.Direction.fromString(sortDirection),sortBy);
		Pageable pagable = PageRequest.of(pageNo, pageSize,sort);
		return empRepository.findAll(pagable);
	}
	
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
