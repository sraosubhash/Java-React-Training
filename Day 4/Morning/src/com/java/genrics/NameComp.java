package com.java.genrics;

import java.util.Comparator;

public class NameComp implements Comparator<GEmploy>{

	@Override
	public int compare(GEmploy o1, GEmploy o2) {
	
		return o1.getName().compareTo(o2.getName());
	}

}
