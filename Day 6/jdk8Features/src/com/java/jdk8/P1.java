package com.java.jdk8;

public class P1 {
			public void show(int x) {
		switch(x) {
		case 1 :
		System.out.println("Hi 1");
		case 2 :
		System.out.println("Bye 2");
		case 3 :
		System.out.println("Hello 3");
		break;
		case 4 :
		System.out.println("Test 4");
		case 5 :
		System.out.println("Demo 5");
		default :
		System.out.println("Default Message");
		}
		}
		public static void main(String[] args) {
		P1 obj = new P1();
		obj.show(3);
		}
		

		

}
