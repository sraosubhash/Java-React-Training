package com.java.jdk8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortEmp {
	
	public static void main(String[] args) {
		
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(1,"Ash",21657));
		empList.add(new Emp(2,"Subhash",21753));
		empList.add(new Emp(3,"Zoro",14990));
		empList.add(new Emp(4,"Kirito",23879));
		empList.add(new Emp(5, "Ashu",32487));
		
		System.out.println("Sort by name");
		
		Collections.sort(empList, (e1, e2) -> {
			return e1.getName().compareTo(e2.getName());
		});
		
		empList.forEach(x -> {
			System.out.println(x);
		});
		
		Collections.sort(empList, (e1,e2) -> {
			return (int)( e1.getBasic() - e2.getBasic());
			
		});
		
		System.out.println("\nSort by basic \n");
		empList.forEach(System.out :: println);
		
	}

}
