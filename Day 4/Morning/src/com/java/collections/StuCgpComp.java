package com.java.collections;

import java.util.Comparator;

public class StuCgpComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student st1 = (Student)o1;
		Student st2 = (Student)o2;
		
		if (st1.getCgpa() >= st2.getCgpa()) {
			return 1;
		}
		return -1;
	}
	
	

}
