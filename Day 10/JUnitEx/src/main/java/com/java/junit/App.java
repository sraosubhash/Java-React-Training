package com.java.junit;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {

  public static void main(String[] args) throws ParseException {
    
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	  Employ emp1 = new Employ(1,"Subhash",sdf.parse("2002-10-10"),"Java","Programmer",87940);
	  //System.out.println(emp1);
	  Bank b1 = new Bank(1,"Ash",sdf.parse("2025-01-01"),"ash","ash","911",911911,"Active",AccountType.valueOf("SAVING"),CheqFacil.valueOf("NO"),898989);
	  System.out.println(b1);
  }

}
