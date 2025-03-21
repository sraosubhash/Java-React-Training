package com.java.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDiffEx {
	
	public void diff(String start, String end) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(start);
		Date d2 = sdf.parse(end);
		long ms = d2.getTime() - d1.getTime();
		long days = (ms/ (1000 * 60 * 60 * 24));
		days++;
		System.out.println("Difference is "+days);
		
	}
	
	public static void main(String[] args) {
		String stDate, endDate;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start date in the format (yyyy-MM-dd) ");
		stDate= sc.next();
		System.out.println("Enter the end date in the for mat (yyyy-MM-dd) ");
		endDate = sc.next();
		
		DateDiffEx obj = new DateDiffEx();
		try {
			obj.diff(stDate, endDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
