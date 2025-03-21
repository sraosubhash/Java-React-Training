package com.java.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {
	
	public static void main(String[] args) {
		
		//Comparator c = new StuNameComp();
		Comparator c = new StuCgpComp();
		
		SortedSet stu = new TreeSet(c);
		stu.add(new Student(1,"Subhash","Mys",8.75));
		stu.add(new Student(2,"ASH","Blr",8.04));
		stu.add(new Student(3,"Zoro","EastBlue",3.78));
		
		System.out.println("Student sorted data ");
		for (Object object : stu) {
			System.out.println(object);
		}
	}

}
