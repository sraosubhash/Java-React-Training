package com.java.jdk8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFile {
	
	public static void main(String[] args) {
		
		File file = new File("C:/Java Training/Day 6/jdk8Features/src/com/java/jdk8/Emp.java");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
