package com.java.junit;

import java.util.Date;

public class Employ {
	
	private int empno;
	private String name;
	private Date dob;
	private String dept;
	private String desig;
	private double basic;
	
	public Employ() {
		
	}

	public Employ(int empno, String name, Date dob, String dept, String desig, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.dob = dob;
		this.dept = dept;
		this.desig = desig;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", dob=" + dob + ", dept=" + dept + ", desig=" + desig
				+ ", basic=" + basic + "]";
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	
	
	

}
