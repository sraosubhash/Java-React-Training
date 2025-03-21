package com.java.employ.dao;

import java.util.List;

import com.java.employ.model.Employ;

public interface EmployDao {
	
	List<Employ>  showEmployDao();
	String addEmployDao(Employ employ);
	Employ searchEmployDao(int empno);
	String deleteEmployDao(int empno);
	String updateEmployDao(Employ empUpdated);

}
