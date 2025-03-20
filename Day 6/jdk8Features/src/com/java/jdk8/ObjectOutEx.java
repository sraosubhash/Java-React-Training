package com.java.jdk8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectOutEx {
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream fout = new FileOutputStream("C:/files/object.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			objout.writeObject(new String("date is "));
			objout.writeObject(new Date());
			fout.close();
			objout.close();
			System.out.println("Objects stored in file");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
