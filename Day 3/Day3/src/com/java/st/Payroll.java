package com.java.st;

public class Payroll {
	
	static double totalSal;
	static {
		totalSal = 0;
	}
	
	public void salary(int empid, double salary) {
		System.out.println("For Employ "+empid+" Salary is "+salary);
		totalSal += salary;
		
	}
	public static void payment() {
		System.out.println("CEO need to issue payment for total "+ totalSal);
		
	}
	
	public static void main(String[] args) {
		Payroll e1 = new Payroll();
		Payroll e2 = new Payroll();
		
		e1.salary(1, 47348);
		e2.salary(2, 29439);
		
		payment();
	}

}
