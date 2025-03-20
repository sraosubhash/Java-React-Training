package com.java.genrics;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortStud {
	
	public static void main(String[] args) {
		
		//Comparator<Stud> c = new StudNameComp();
		Comparator<Stud> c = new StudCgpComp();
		SortedSet<Stud> ss = new TreeSet<Stud>(c);
		
		ss.add(new Stud(1,"Subhash","Mys",8.75));
		ss.add(new Stud(2,"Ash","Blr",9.12));
		ss.add(new Stud(3,"Zoro","EastBlue",3.49));
		
		System.out.println("Employee list are");
		for (Stud stud : ss) {
			System.out.println(stud);			
		}
	}

}
