package com.java.exception;

interface IOne{
	default void show() {
		System.out.println("Show from IOne");
	}
}

interface ITwo{
	default void show() {
		System.out.println("Show from ITwo");
	}
}

interface IThree{
	default void show() {
		System.out.println("Show from IThree");
	}
}

public class Test implements IOne, ITwo, IThree{

	@Override
	public void show() {
		IOne.super.show();
		ITwo.super.show();
		IThree.super.show();
	}
	
	public static void main(String[] args) {
		new Test().show();
	}	
	

}
