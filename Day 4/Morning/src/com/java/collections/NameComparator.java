package com.java.collections;

import java.util.Comparator;

public class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Employ emp1 = (Employ)o1;
		Employ emp2 = (Employ)o2;
		return emp1.getName().compareTo(emp2.getName());
		
		//To print in reverse order, change condition to emp2.get... compareTo emp1.getName
	}

}
