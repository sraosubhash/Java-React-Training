package com.java.genrics;


class Test<T>{
	public void swap(T a, T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value "+a+" B value "+b);
	
	}
}
public class GenEx1 {
	public static void main(String[] args) {
		Test test = new Test();
		int a=7, b=9;
		test.swap(a, b);
		String s1="ASH", s2="Subhash";
		test.swap(s1, s2);
		boolean b1=true, b2=false;
		test.swap(b1, b2);
		
		GEmploy emp1 = new GEmploy();
		GEmploy emp2 = new GEmploy();
		test.swap(emp1, emp2);
	}

}
