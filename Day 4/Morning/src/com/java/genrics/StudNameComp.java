package com.java.genrics;

import java.util.Comparator;

public class StudNameComp implements Comparator<Stud>{

	@Override
	public int compare(Stud o1, Stud o2) {
		return (o1.getName().compareTo(o2.getName()));
	}

}
