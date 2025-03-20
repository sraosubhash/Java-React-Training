package com.java.cons;

public class StudArr {
	
	public static void main(String[] args) {
		Student [] stu = new Student [] {
				new Student(1,"ASH",8),
				new Student(2,"Subhash",8.75),
				new Student(3,"Zoro",3.25)
		};
		
		for (Student s : stu) {
			System.out.println(s);
			
		}
	}

}
