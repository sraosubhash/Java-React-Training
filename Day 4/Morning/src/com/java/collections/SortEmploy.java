package com.java.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	
	public static void main(String[] args) {
		
	//	Comparator c = new NameComparator();
		
		Comparator c = new BasicComparator();
		SortedSet employs = new TreeSet(c);
		employs.add(new Employ(1,"ASH",878070));
		employs.add(new Employ(2,"Subhash",92739));
		employs.add(new Employ(3,"Kirito",51323));
		
		System.out.println("Employ sort data ");
		for (Object object : employs) {
			System.out.println(object);
		}
		
	}

}
