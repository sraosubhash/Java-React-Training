package com.java.genrics;

import java.util.ArrayList;
import java.util.List;

public class GenEx2 {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ash");
		names.add("Subhash");
		names.add("Zoro");
		
		System.out.println("Names are ");
		for (String string : names) {
			System.out.println(string);
		}
	}

}
