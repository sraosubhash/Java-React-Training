package com.java.cons;

public class Student {
	
	int Stid;
	String name;
	double cgpa;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stid, String name, double cgpa) {
		super();
		Stid = stid;
		this.name = name;
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [Stid=" + Stid + ", name=" + name + ", cgpa=" + cgpa + "]";
	}
	
	

}
