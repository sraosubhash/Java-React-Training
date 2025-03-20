package com.java.genrics;

import java.util.ArrayList;
import java.util.List;

import com.java.collections.Employ;

public class GenEmploy {
	
	public static void main(String[] args) {
		List<Employ> empList = new ArrayList<Employ>();
		
		empList.add(new Employ(1,"ASH",26998.87));
		empList.add(new Employ(2,"Subhash",98173));
		empList.add(new Employ(3,"Zoro",31279));
		empList.add(new Employ(4,"Kirito",82389));
		
		System.out.println("Employ list is ");
		for (Employ employ : empList) {
			System.out.println(employ);
			
		}
		
	}

}
