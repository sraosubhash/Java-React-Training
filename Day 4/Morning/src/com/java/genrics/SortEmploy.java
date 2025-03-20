package com.java.genrics;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;


public class SortEmploy {
	
	public static void main(String[] args) {
		//Comparator<GEmploy> c = new NameComp();
		Comparator<GEmploy> c = new BasicComp();
		SortedSet<GEmploy> empList = new TreeSet<GEmploy>(c);
		
		
		empList.add(new GEmploy(1,"ASH",26998.87));
		empList.add(new GEmploy(2,"Subhash",98173));
		empList.add(new GEmploy(3,"Zoro",31279));
		empList.add(new GEmploy(4,"Kirito",82389));
		
		System.out.println("Employ Records are");
		for (GEmploy employ : empList) {
			System.out.println(employ);
		}
	}

}
