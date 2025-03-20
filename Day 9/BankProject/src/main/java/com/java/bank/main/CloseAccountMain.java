package com.java.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.bank.dao.BankDaoImp;

public class CloseAccountMain {
	
	public static void main(String[] args) {
		
		int accountno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account number : ");
		accountno = sc.nextInt();
		try {
			System.out.println(new BankDaoImp().closeAccount(accountno));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
