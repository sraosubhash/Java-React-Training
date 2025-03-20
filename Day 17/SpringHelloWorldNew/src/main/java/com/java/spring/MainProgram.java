package com.java.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProgram {
	
	public static void main(String[] args) {
		String sname;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name  ");
		sname = sc.nextLine();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spring/HelloWorld.xml");
		HelloWorld helloWorld = (HelloWorld)ctx.getBean("beanHelloWorld");
		helloWorld.show(sname);
	}

}
