package com.java.jdk8;

interface ICal{
	int cal(int a, int b);
}

public class Lambda2 {
	
	public static void main(String[] args) {
		
		ICal obj1 = (a,b) ->{
			return a+b ;
		};
		
		ICal obj2 = (a,b) -> {
			return a-b;
		};
		
		ICal obj3 = (x,y) -> {
			return x*y;
		};
		
		System.out.println("Sum "+obj1.cal(12, 5));
		System.out.println("Sub "+obj2.cal(12, 5));
		System.out.println("Mult "+obj3.cal(12, 5));
	}

}
