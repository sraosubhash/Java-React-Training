package com.java.cols;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapEx1 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> empData = new Hashtable<Integer, String>();
		empData.put(1, "Ash");
		empData.put(2, "Subhash");
		empData.put(3, "Zoro");
		empData.put(4, "Kirito");
		
		int empno;
		String result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Empno to search data");
		empno=sc.nextInt();
		result = empData.getOrDefault(empno, "Employee Record not found");
		System.out.println(result);
	}

}
