package com.java.sup;

public class AbsEx2 {
	
	public static void main(String[] args) {
		Animal [] arr = new Animal[] {
				new Crocodile(), new Lion()
		};
		
		for (Animal a : arr) {
			a.name();
			a.type();
		}
	}

}
