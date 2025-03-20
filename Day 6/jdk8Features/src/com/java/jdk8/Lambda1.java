package com.java.jdk8;

interface IData{
	void greeting();
}

public class Lambda1 {
	
	public static void main(String[] args) {
		
		IData obj1 = () ->{
			System.out.println("Welcome to Brillio");
		};
		
		IData obj2 = () -> {
			System.out.println("Java Full stack training");
		};
		
		IData obj3 = () -> {
			System.out.println("First test result today");
		};
		
		obj1.greeting();
		obj2.greeting();
		obj3.greeting();
	}

}
