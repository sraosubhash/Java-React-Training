package com.java.exception;

import java.util.Scanner;

public class enumEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Gender(Male/Female) ");
		Gender gender;
		try {
			gender = Gender.valueOf(sc.next());
			System.out.println(gender);
		}catch(IllegalArgumentException e) {
			System.err.println("Invalid enum value");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
