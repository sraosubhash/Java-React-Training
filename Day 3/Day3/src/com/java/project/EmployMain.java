package com.java.project;

import java.util.Scanner;

public class EmployMain {
	
	static EmployOps empOps;
	
	static {
		empOps = new EmployOps();
	}
	
	public static void readEmpMain() {
		empOps.readEmp();
	}
	
	public static void showEmpMain() {
		if(empOps.flag == false) {
			System.out.println("No records are added till now...");
			return;
		}
		Employ[] arr = empOps.showEmploy();
		for (Employ emp : arr) {
			System.out.println(emp);
		}
	}
	public static void searchEmpMain() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employ id to seach record");
		int x = sc.nextInt();
		Employ empFound = empOps.searchEmploy(x);
		if(empFound!=null) {
			System.out.println(empFound);
		}else {
			System.out.println("*** Employ not foud ***");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("O P E R A T I O N S");
			System.out.println("--------------------");
			System.out.println("1. Enter Employee details");
			System.out.println("2. Display Employee details");
			System.out.println("3. Search Employee detail");
			System.out.println("4. Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				readEmpMain();
				break;
			case 2 :
				showEmpMain();
				break;
			case 3 :
				searchEmpMain();
				break;
			case 4:
				return;
			default:
				System.out.println("Enter a valid choice!");
			}
			
			
			
		}while(choice!=4);
	}

}
