package com.java.sup;

public class AbsEx1 {
	
	public static void main(String[] args) {
		
		Flight[] arr = new Flight[] {
				new Ash(),
				new Harshi()
		};
		
		for (Flight f : arr) {
			f.idProof(); 
			f.ticket();
		}
		
		
	}

}
