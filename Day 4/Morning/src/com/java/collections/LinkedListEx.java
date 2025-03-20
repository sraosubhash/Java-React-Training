package com.java.collections;

import java.util.LinkedList;

public class LinkedListEx {
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("Subhash");
		ll.add("Zoro");
		ll.add("Kirito");
		
		ll.addFirst("ASH");
		ll.addLast("Hiccup");
		
		System.out.println("Contents in linked list are ");
		for (Object object : ll) {
			System.out.println(object);			
		}
	}

}
