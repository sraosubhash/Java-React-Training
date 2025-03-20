package com.java.intf;

public class ReadOnlyEx {
	
	private int custId;
	private String custname;
	
	
	public ReadOnlyEx() {
		
	}


	public ReadOnlyEx(int custId, String custname) {
		super();
		this.custId = custId;
		this.custname = custname;
	}
	
	

	@Override
	public String toString() {
		return "ReadOnlyEx [custId=" + custId + ", custname=" + custname + "]";
	}


	public int getCustId() {
		return custId;
	}


	public String getCustname() {
		return custname;
	}
	
	public static void main(String[] args) {
		ReadOnlyEx obj1 = new ReadOnlyEx(1,"Anoop");
		System.out.println(obj1.custId);
		System.out.println(obj1.custname);
	}
	
	
	

}
