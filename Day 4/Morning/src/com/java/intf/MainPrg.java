package com.java.intf;

public class MainPrg {
	
	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
				new Akash(), new Anoop(), new Harshit()
		};
		
		for (ITraining It : arr) {
			
			It.name();
			It.email();
			
		}
	}

}
