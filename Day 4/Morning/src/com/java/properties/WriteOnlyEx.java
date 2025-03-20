package com.java.properties;

public class WriteOnlyEx {
	
	private int custId;
	private String custName;
	
	
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "WriteOnlyEx [custId=" + custId + ", custName=" + custName + "]";
	}
	
	public static void main(String[] args) {
		WriteOnlyEx obj1 = new WriteOnlyEx();
		obj1.setCustId(1);
		obj1.setCustName("Aakash");
		System.out.println(obj1);
	}
	
	
	

}
