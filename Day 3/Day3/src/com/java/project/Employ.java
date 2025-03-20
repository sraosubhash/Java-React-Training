package com.java.project;

public class Employ {
	
	int Empid;
	String name;
	String city;
	double salary;
	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employ(int empid, String name, String city, double salary) {
		super();
		Empid = empid;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employ [Empid=" + Empid + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	
	

}
