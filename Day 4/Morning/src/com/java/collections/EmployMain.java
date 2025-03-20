package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class EmployMain {
	
	public static void main(String[] args) {
		List empList = new ArrayList();
		
		empList.add(new Employ(1,"ASH",26998.87));
		empList.add(new Employ(2,"Subhash",98173));
		empList.add(new Employ(3,"Zoro",31279));
		empList.add(new Employ(4,"Kirito",82389));
		
		System.out.println("Employ list is ");
		for (Object obj : empList) {
			Employ employ = (Employ)obj;
			System.out.println(obj);
			
		}
		
	}

}
