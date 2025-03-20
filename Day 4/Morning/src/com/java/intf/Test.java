package com.java.intf;

public class Test implements IOne, ITwo{

	@Override
	public void email() {
		// TODO Auto-generated method stub
		System.out.println("Email is hr@brillio.com");
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Name is Brillio");
		
	}
	
	public static void main(String[] args) {
		Test ts = new Test();
		ts.name();
		ts.email();
	}

}
