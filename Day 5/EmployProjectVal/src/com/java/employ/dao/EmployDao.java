package com.java.employ.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.java.employ.model.Employ;

//Data Layer - Data Access Object (DAO)

public interface EmployDao {
	
	String addEmployDao(Employ employ);
	List<Employ> showEmployDao();
	Employ searchEmployDao(int empno);
	String deleteEmployDao(int empno);
	String updateEmployDao(Employ empUpdated);
	String writeEmployFileDao() throws FileNotFoundException, IOException;
	String readEmployFileDao() throws ClassNotFoundException, IOException;

}
