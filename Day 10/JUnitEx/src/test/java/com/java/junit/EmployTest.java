package com.java.junit;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class EmployTest {

	@Test
	public void testConstructor() throws ParseException {
		Employ employ = new Employ();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Employ emp1 = new Employ(1,"Subhash", sdf.parse("2002-10-10"),"Java","Programmer",89000.00);
		assertEquals(1, emp1.getEmpno());
		assertEquals("Subhash", emp1.getName());
		assertEquals(sdf.parse("2002-10-10"), emp1.getDob());
		assertEquals("Java", emp1.getDept());
		assertEquals("Programmer", emp1.getDesig());
		assertEquals(89000, emp1.getBasic(),0);
	}
	
	@Test
	public void testGettersAndSetters() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Employ emp = new Employ();
		emp.setEmpno(1);
		emp.setName("Subhash");
		emp.setDob(sdf.parse("2002-10-10"));
		emp.setDept("Java");
		emp.setDesig("Programmer");
		emp.setBasic(89000.12);
		
		assertEquals(1, emp.getEmpno());
		assertEquals("Subhash", emp.getName());
		assertEquals(sdf.parse("2002-10-10"), emp.getDob());
		assertEquals("Java", emp.getDept());
		assertEquals("Programmer", emp.getDesig());
		assertEquals(89000, emp.getBasic(),2);
		
	}
	
	@Test
	public void testToString() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 Employ emp1 = new Employ(1,"Subhash",sdf.parse("2002-10-10"),"Java","Programmer",87940);
		 String result = "Employ [empno=1, name=Subhash, dob=Thu Oct 10 00:00:00 IST 2002, dept=Java, desig=Programmer, basic=87940.0]";
		 assertEquals(result, emp1.toString());
		
		
	}
	

}
