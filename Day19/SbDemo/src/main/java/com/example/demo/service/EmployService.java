package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employ;

@Service
public class EmployService {
	
	static List<Employ> empList;
	static {
		empList = new ArrayList<Employ>();
		empList.add(new Employ(1, "Subhash", 87689));
		empList.add(new Employ(2, "Ash",76980));
		empList.add(new Employ(3,"Zoro",98765));
		empList.add(new Employ(4,"Kirito",78923));
		empList.add(new Employ(5,"Hiccup", 99889));
	}
	
	public List<Employ> showEmploy(){
		return empList;
	}
	
	public Employ searchEmploy(int empno) {
		Employ empFound = null;
		if (empno == 1) {
			empFound = empList.get(0);
		}
		if (empno == 2) {
			empFound = empList.get(1);
		}
		if (empno == 3) {
			empFound = empList.get(2);
		}
		if (empno == 4) {
			empFound = empList.get(3);
		}
		if (empno == 5) {
			empFound = empList.get(4);
		}
		return empFound;
	}

}
