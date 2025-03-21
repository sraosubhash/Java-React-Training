package com.java.employ.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.java.employ.model.Employ;



public class EmployDaoImp implements EmployDao{
	
	
	static Scanner sc;
	static List<Employ> empList;
	
	static {
		sc = new Scanner(System.in);
		empList = new ArrayList<Employ>();
	}

	@Override
	public String addEmployDao(Employ employ) {
		empList.add(employ);
		return "Employ record sucessuflly added...";
	}

	@Override
	public List<Employ> showEmployDao() {
		
		return empList;
	}

	@Override
	public Employ searchEmployDao(int empno) {
		Employ empFound = null;
		for (Employ employ : empList) {
			if (employ.getEmpno() == empno) {
				empFound = employ;
				break;
			}
		}
		return empFound;
	}

	@Override
	public String deleteEmployDao(int empno) {
		Employ empFound = searchEmployDao(empno);
		if (empFound!=null) {
			empList.remove(empFound);
			return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public String updateEmployDao(Employ empUpdated) {
		Employ empFound = searchEmployDao(empUpdated.getEmpno());
		if (empFound !=null) {
			empFound.setName(empUpdated.getName());
			empFound.setGender(empUpdated.getGender());
			empFound.setDob(empUpdated.getDob());
			empFound.setDept(empUpdated.getDept());
			empFound.setDesig(empUpdated.getDesig());
			empFound.setBasic(empUpdated.getBasic());
			return "Employ Record Updated...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public String writeEmployFileDao() throws IOException{
		FileOutputStream fout = new FileOutputStream("C:/files/output.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(empList);
		objout.close();
		fout.close();
		return "Data Stored Sucessfully";
	}

	@Override
	public String readEmployFileDao() throws IOException, ClassNotFoundException{
		FileInputStream fin = new FileInputStream("C:/files/output.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		empList = (List<Employ>)objin.readObject();
		fin.close();
		objin.close();
		return "Data Retrived Sucessfully";
	}
	
	

}
