package com.java.delete;

class C1 {
	void test() {
		System.out.println("Welcome...");
	}
}
class C2 extends C1 {
	void test() {

		System.out.println("Bye");
	}
}
public class P28 {
	public static void main(String[] args) {
		C1 obj = (C1)new C2();
		obj.test();
	}
}
