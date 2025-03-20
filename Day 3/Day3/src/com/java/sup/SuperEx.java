package com.java.sup;

//Super as KeyWord

class First{
	public void show() {
		System.out.println("Show From Classs First...");
	}
}
class Second extends First{
	public void show() {
		super.show();
		System.out.println("Show from second class...");
	}
}
public class SuperEx {
	public static void main(String[] args) {
		Second obj = new Second();
		obj.show();
	}

}
