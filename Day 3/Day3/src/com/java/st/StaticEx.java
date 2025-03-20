package com.java.st;

public class StaticEx {
	
	static int count; //without static out put will be 1 1 1
	
	public void increment() {
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		StaticEx obj1 = new StaticEx();
		StaticEx obj2 = new StaticEx();
		StaticEx obj3 = new StaticEx();
		
		obj1.increment();
		obj2.increment();
		obj3.increment();
	}

}
