package com.java.genrics;

import java.util.Comparator;

public class StudCgpComp implements Comparator<Stud>{

	@Override
	public int compare(Stud o1, Stud o2) {
		if(o1.getCgpa()>=o2.getCgpa()) {
			return 1;
		}
		return -1;
	}

}
