package com.java.collections;

import java.util.Comparator;

public class StuSidComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student st1 = (Student)o1;
		Student st2 = (Student)o2;
		
		if(st1.getSid() == st2.getSid()) {
			Student.delete
		}
		if (st1.getSid() > st2.getSid()) {
			return 1;
		}
		return -1;
	}
	
	

}
