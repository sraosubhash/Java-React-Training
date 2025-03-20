package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
	
	public static void main(String[] args) {
		List stud = new ArrayList();
		
		stud.add(new Student(1,"ASH","Mys",8.6));
		stud.add(new Student(2,"Subhash","Blr",8.75));
		stud.add(new Student(3,"Zoro","EastBlue",3.78));
		
		System.out.println("Student list are as follows ");
		
		for (Object obj : stud) {
			
			Student stu = (Student)obj;
			System.out.println(obj);
			
		}
	}

}
