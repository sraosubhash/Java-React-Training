package com.java.jdk8;

@FunctionalInterface
interface IGreeting{
	String greet();
}

public class FunctionalInterfaceEx1 {
	
	public static void main(String[] args) {
		
		IGreeting obj1 = () -> {
			return "Welcome to Brillio";
		};
		
		IGreeting obj2 = () -> {
			return "Java fullstack training";
		};
		IGreeting obj3 = () -> {
			return "Hello world!";
		};
		
		System.out.println(obj1.greet());
		System.out.println(obj2.greet());
		System.out.println(obj3.greet());
	}

}
