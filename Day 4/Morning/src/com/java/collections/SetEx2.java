package com.java.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx2 {
	
	public static void main(String[] args) {
		Set names = new LinkedHashSet();
		
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
