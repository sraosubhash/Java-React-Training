package com.java.jdk8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx1 {
	
	
public static void main(String[] args) {
		
		File file = new File("C:/Java Training/Day 6/jdk8Features/src/com/java/jdk8/Emp.java");
		try {
			FileReader fr =new FileReader(file);
			int ch;
			while ((ch=fr.read()) != -1) {
				System.out.print((char)ch);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

}
}