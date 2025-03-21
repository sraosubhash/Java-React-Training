package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
	
	public static void main(String[] args) {
		
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(1,"Ash",21657));
		empList.add(new Emp(2,"Subhash",21753));
		empList.add(new Emp(3,"Zoro",14990));
		empList.add(new Emp(4,"Kirito",23879));
		empList.add(new Emp(5, "Ashu",32487));
		
		Stream<Emp> filter1 = empList.stream().filter(x -> x.getBasic() >= 20000);
		
		System.out.println("Filtered data ");
		filter1.forEach(x ->{
			System.out.println(x);
		});
		
		Stream<Emp> filter2 = empList.stream().filter(x -> x.getName().startsWith("A"));
		System.out.println("Names starting with letter A");
		filter2.forEach(x ->  {
			System.out.println(x);
		});
	}

}
