package com.java.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ProductInfo {
	
	public static void main(String[] args) {
		List<Product> prList = new ArrayList<Product>();
		prList.add(new Product(1, "Samsung A5", 17000f));
		prList.add(new Product(2, "Iphone 6s", 65000f));
		prList.add(new Product(3, "Sony Xpreria", 25000f));
		prList.add(new Product(4, "Nokia Lumia", 15000f));
		prList.add(new Product(5, "Redmi 4", 26000f));
		prList.add(new Product(6, "Lenevo Vibe", 19000f));
		
		prList.stream().forEach(System.out::println);
		
		System.out.println("\nMaximum price value");
		
		Product p1 = prList.stream().max((m1,m2) -> m1.getPrice() > m2.getPrice() ? 1 : -1).get();
		System.out.println(p1);
		
		System.out.println("\nMinimum price value");
		Product p2 = prList.stream().min((m1,m2) -> m1.getPrice() > m2.getPrice() ? 1: -1).get();
		System.out.println(p2);
		
		System.out.println("\n Product name starting with S ");
		Stream<Product> p3 = prList.stream().filter(x -> x.getName().startsWith("S"));
		p3.forEach(System.out::println);
		
		System.out.println("\nProduct in decinding order wrt price");
		Collections.sort(prList, (x1,x2) -> {
			return (int)(x1.getPrice() - x2.getPrice());
		});
		prList.forEach(System.out::println);
		
		System.out.println("\nProduct in accending order wrt price");
		Collections.sort(prList, (x1,x2) -> {
			return (int)(x2.getPrice() - x1.getPrice());
		});
		prList.forEach(System.out::println);
		
	
	}
}
