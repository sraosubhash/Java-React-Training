package com.example.demo.service;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.demo.modle.Employ;

@Service
public class EmployService {
	
	private static Map< Long, Employ > employeeRepsitory = null;

    static {

        Stream< String > employeeStream = Stream.of("1,Shamik  Mitra,Java,Architect", "2,Samir  Mitra,C++,Manager",
            "3,Swastika  Mitra,AI,Sr.Architect");

        employeeRepsitory = employeeStream.map(employeeStr -> {
        	String[] info = employeeStr.split(",");
        	return createEmployee(new Long(info[0]), info[1], info[2], info[3]);
        }).collect(Collectors.toMap(Employ::getEmployId, emp -> emp));

    }

    private static Employ createEmployee(Long id, String name, String practiceArea, String designation) {
        Employ emp = new Employ();
        emp.setEmployId(id);
        emp.setName(name);
        emp.setPracticeArea(practiceArea);
        emp.setDesignation(designation);
        emp.setCompanyInfo("Cognizant");
        return emp;
    }

    public Employ findById(Long id) {
        return employeeRepsitory.get(id);
    }

    public Collection< Employ > findAll() {
        return employeeRepsitory.values();
    }

}