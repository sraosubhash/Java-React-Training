package com.java.beans;

public class Calculation {
	
	int firstNo;
	int secondNo;
	
	public int getFirstNo() {
		return firstNo;
	}
	public void setFirstNo(int firstNo) {
		this.firstNo = firstNo;
	}
	public int getSecondNo() {
		return secondNo;
	}
	public void setSecondNo(int secondNo) {
		this.secondNo = secondNo;
	}
	
	
	public int sum() {
		return firstNo+secondNo;
	}
	
	public int sub() {
		return firstNo-secondNo;
	}
	
	public int mul() {
		return firstNo*secondNo;
	}
	

}
