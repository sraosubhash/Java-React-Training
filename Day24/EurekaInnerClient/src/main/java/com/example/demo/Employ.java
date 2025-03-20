package com.example.demo;

public class Employ {
	
	private int empno;
	private String ename;
	private String gender;
	private String dept;
	private String desig;
	private double basic;
	
	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employ(int empno, String ename, String gender, String dept, String desig, double basic) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.gender = gender;
		this.dept = dept;
		this.desig = desig;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", ename=" + ename + ", gender=" + gender + ", dept=" + dept + ", desig="
				+ desig + ", basic=" + basic + "]";
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
