package com.java.inh;

class C1{
	C1(){
		System.out.println("Base class Constructor...");
	}
}

class C2 extends C1{
	C2(){
		System.out.println("Derived class Constructor");
	}
}
public class Inhcon {
	public static void main(String[] args) {
		new C2();
	}

}
