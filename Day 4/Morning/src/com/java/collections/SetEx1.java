package com.java.collections;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
	
	public static void main(String[] args) {
		Set names = new HashSet();
		
		//Drawback: The output will not be in insertion order
		
		names.add("ASH");
		names.add("Subhash");
		names.add("Zoro");
		names.add("ASH");
		names.add("Subhash");
		names.add("Zoro");
		names.add("ASH");
		names.add("Subhash");
		names.add("Zoro");
		names.add("ASH");
		names.add("Subhash");
		names.add("Zoro");
		names.add("Kirito");
		
		System.out.println("Data ");
		for (Object object : names) {
			System.out.println(object);
		}
	}

}
