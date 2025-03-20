package com.java.jdk8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmploy {
	
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("C:/files/empdata.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			Employ employ = new Employ(1,"Ash",39456.22);
			objout.writeObject(employ);
			objout.close();
			fout.close();
			System.out.println("Employ object stored");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
