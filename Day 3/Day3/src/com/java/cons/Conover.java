package com.java.cons;

public class Conover {
	int a,b;
	
	public Conover(){
		this.a =7;
		this.b = 5;
	}
	public Conover(int a, int b) {
		this.a = a;
		this.b =b;
	}
	
	

	@Override
	public String toString() {
		return "Conover [a=" + a + ", b=" + b + "]";
	}
	public static void main(String[] args) {
		Conover obj1 = new Conover();
		System.out.println(obj1);
		Conover obj2 = new Conover(15,22);
		System.out.println(obj2);
	

	}

}
