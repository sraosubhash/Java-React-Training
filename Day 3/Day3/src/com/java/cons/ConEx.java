package com.java.cons;

public class ConEx {
	
	static {
		System.out.println("Static Constructor...");
	}
	
	public ConEx() {
		System.out.println("General Constructor");
	}
	
	public static void main(String[] args) {
		ConEx obj = new ConEx();
	}
	
	
}
