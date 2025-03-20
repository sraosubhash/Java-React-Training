package com.java.collections;

public class Student {
	
	private int sid;
	private String name;
	private String city;
	private double cgpa;
	
	
	public Student() {
		
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public double getCgpa() {
		return cgpa;
	}


	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", city=" + city + ", cgpa=" + cgpa + "]";
	}


	public Student(int sid, String name, String city, double cgpa) {
		super();
		this.sid = sid;
		this.name = name;
		this.city = city;
		this.cgpa = cgpa;
	}
	
	
	
	

}
