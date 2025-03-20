package com.java.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetEx3 {
	
	public static void main(String[] args) {
		Set names = new TreeSet();
		
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
