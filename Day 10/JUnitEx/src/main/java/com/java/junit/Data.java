package com.java.junit;

import java.util.Hashtable;
import java.util.Map;

public class Data {
	
	public String sayHello() {
		return "Welcome to Junit...";
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int max3(int a,int b, int c) {
		int m = a;
		if (m<b) {
			m=b;
			
		}
		if(m<c) {
			m=c;
		}
		return m;
	}
	
	public boolean evenOdd(int n) {
		if(n%2==0) {
			return true;
		}
		return false;
	}
	
	public Object show(int empId) {
		Map map = new Hashtable();
		map.put(1, "Anoop");
		map.put(2, "Manoj");
		map.put(3,"Srinath");
		return map.get(empId);
		
	}

}
