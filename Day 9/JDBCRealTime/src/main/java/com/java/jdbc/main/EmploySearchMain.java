package com.java.jdbc.main;

import java.util.Scanner;

import com.java.jdbc.dao.EmployDao;
import com.java.jdbc.dao.EmployDaoImp;
import com.java.jdbc.model.Employ;

public class EmploySearchMain {
	public static void main(String[] args) {
		EmployDao dao=new EmployDaoImp();
		Scanner sc=new Scanner(System.in);
		int empno;
		System.out.println("enter empno");
		empno=sc.nextInt();
		
		try {
			Employ employ=dao.searchEmploy(empno);
			
			if(employ!=null)
				System.out.println(employ);
			
			else {
				System.out.println("not found");
			}
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
		
	
}
 
