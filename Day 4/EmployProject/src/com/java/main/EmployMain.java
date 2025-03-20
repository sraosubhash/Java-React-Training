package com.java.main;

import java.util.List;
import java.util.Scanner;

import com.java.employ.dao.EmployDao;
import com.java.employ.dao.EmployDaoImpl;
import com.java.employ.model.Employ;

public class EmployMain {
	
	static Scanner sc;
	static EmployDao empDao;
	
	static {
		sc = new Scanner(System.in);
		empDao = new EmployDaoImpl();
	}
	
	public static void AddEmployMain() {
		Employ emp = new Employ();
		System.out.println("Ente Employee Number ");
		emp.setEmpno(sc.nextInt());
		System.out.println("Enter Employee Name ");
		emp.setName(sc.next());
		System.out.println("Enter Employee Gender(Male/Female) ");
		emp.setGender(sc.next());
		System.out.println("Enter Employee Depertment ");
		emp.setDept(sc.next());
		System.out.println("Enter Employee Designation ");
		emp.setDesig(sc.next());
		System.out.println("Enter Employee Basic ");
		emp.setBasic(sc.nextDouble());
		
		System.out.println(empDao.addEmployDao(emp));
	}
	
	public static void ShowEmployMain() {
		List<Employ> empList = empDao.showEmployDao();
		for (Employ employ : empList) {
			System.out.println(employ);
		}
	}
	
	public static void searchEmployMain() {
		int empno;
		System.out.println("Enter Employ no ");
		empno = sc.nextInt();
		Employ empFound = empDao.searchEmployDao(empno);
		if (empFound!=null) {
			System.out.println(empFound);
		}else {
			System.out.println("***Employ not found***");
		}
	}
	
	public static void deleteEmployMain() {
		int empno;
		System.out.println("Enter Emmployee number to be deleted ");
		empno = sc.nextInt();
		System.out.println(empDao.deleteEmployDao(empno));
	}
	
	public static void UpdateEmployMain() {
		/*int empno;
		System.out.println("Enter Employee number to be updated ");
		empno = sc.nextInt();*/
		
		Employ emp = new Employ();
		System.out.println("Ente Employee Number ");
		emp.setEmpno(sc.nextInt());
		System.out.println("Enter Employee Name ");
		emp.setName(sc.next());
		System.out.println("Enter Employee Gender(Male/Female) ");
		emp.setGender(sc.next());
		System.out.println("Enter Employee Depertment ");
		emp.setDept(sc.next());
		System.out.println("Enter Employee Designation ");
		emp.setDesig(sc.next());
		System.out.println("Enter Employee Basic ");
		emp.setBasic(sc.nextDouble());
		System.out.println(empDao.updateEmployDao(emp));
		
		
	}
	
	public static void main(String[] args) {
		int choice;
		do {
			
			System.out.println("O P T I O N S");
			System.out.println("------------------");
			System.out.println("1. Add Employ");
			System.out.println("2. Show Employ");
			System.out.println("3. Search Employ");
			System.out.println("4. Update Employ");
			System.out.println("5. Delete Employ");
			System.out.println("6. EXIT");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				AddEmployMain();
				break;
			case 2:
				ShowEmployMain();
				break;
			case 3:
				searchEmployMain();
				break;
			case 4:
				UpdateEmployMain();
				break;
			case 5:
				deleteEmployMain();
				break;
			case 6:
				return;
			default:
				System.out.println("Invalid choice");
				break;
			}
			
		}while(choice != 6);
	}

}
