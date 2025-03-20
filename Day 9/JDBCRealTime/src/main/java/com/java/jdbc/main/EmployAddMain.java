package com.java.jdbc.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.jdbc.dao.EmployDaoImp;
import com.java.jdbc.model.Employ;
import com.java.jdbc.model.gender;

public class EmployAddMain {
	
	public static void main(String[] args) {
		Employ emp = new Employ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ no : ");
		emp.setEmpno(sc.nextInt());
		System.out.println("Enter name ");
		emp.setName(sc.next());
		System.out.println("Enter Gender (Male/Female) ");
		emp.setGender(gender.valueOf(sc.next()));
		System.out.println("Enter Department ");
		emp.setDept(sc.next());
		System.out.println("Enter Designation ");
		emp.setDesig(sc.next());
		System.out.println("Enter Basic ");
		emp.setBasic(sc.nextDouble());
		
		try {
			System.out.println(new EmployDaoImp().addEmploy(emp));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
