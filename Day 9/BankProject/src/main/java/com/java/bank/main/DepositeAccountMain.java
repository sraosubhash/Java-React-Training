package com.java.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.bank.dao.BankDao;
import com.java.bank.dao.BankDaoImp;

public class DepositeAccountMain {
	
	public static void main(String[] args) {
		
		int accountno;
		double depositeAccount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account no : ");
		accountno = sc.nextInt();
		System.out.println("Enter Deposit ammount ");
		depositeAccount = sc.nextDouble();
		BankDao dao = new BankDaoImp();
		
		try {
			System.out.println(dao.depositAccount(accountno, depositeAccount));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
