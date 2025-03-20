package com.java.genrics;

import java.util.Comparator;

public class BasicComp implements Comparator<GEmploy>{

	@Override
	public int compare(GEmploy o1, GEmploy o2) {
		if(o1.getBasic()>=o2.getBasic()) {
			return 1;
		}
		return -1;
	}

}
