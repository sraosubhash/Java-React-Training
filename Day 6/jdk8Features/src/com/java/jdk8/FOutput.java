package com.java.jdk8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOutput {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream src = new FileInputStream("C:/Java Training/Day 6/jdk8Features/src/com/java/jdk8/Emp.java");
			FileOutputStream tar = new FileOutputStream("C:/files/EmpNew.txt");
			int ch;
			while((ch=src.read()) != -1) {
				tar.write((char)ch);
			}
			src.close();
			tar.close();
			System.out.println("*** File copied sucessfully ***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
