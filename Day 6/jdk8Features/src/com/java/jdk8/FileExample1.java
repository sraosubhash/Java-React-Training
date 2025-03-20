package com.java.jdk8;

import java.io.File;

public class FileExample1 {
	
	public static void main(String[] args) {
		File files = new File("C:/Java Training/Day 6/jdk8Features/src/com/java/jdk8/Emp.java");
		System.out.println("File name "+files.getName());
		System.out.println("Parent "+files.getParent());
		System.out.println("Path of the file "+files.getPath());
	}

}
