package com.java.inh;

class First {
	void display() {System.out.println("Displaying contents of class First");
	}
}

class Second extends First{
	void show() {
		System.out.println("Show method from class Second");
	}
}

public class InherantenceEx {
	public static void main(String[] args) {
		Second obj = new Second();
		obj.display();
		obj.show();
	}
	

}
