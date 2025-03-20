package com.java.delete;

class X1 {
	int a;
	public X1(int a) {
		this.a=a;
	}
}
class X2 extends X1 {
	int a;
	int b;
	public X2(int a) {
		super(a);
		this.a=12;
		this.b=5;
	}
	public X2(int a,int b) {
		super(a);
		this.b=b;
		System.out.println(a+ " "+b);
	}
}
public class P30 {
	public static void main(String[] args) {
		new X2(15,56);
	}
}
