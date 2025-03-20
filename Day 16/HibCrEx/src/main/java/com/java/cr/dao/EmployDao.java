package com.java.cr.dao;

import java.util.List;

import com.java.cr.model.Employ;
import com.java.cr.model.Login;

public interface EmployDao {
	
	List<Employ> showEmployDao();
	Employ searchEmployDao(int empno);
	List<String> showName();
	Double totalSalary();
	Long totalRecords();
	String addUser(Login login);

}
