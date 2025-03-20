package com.java.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.bank.dao.BankDao;
import com.java.bank.dao.BankDaoImp;
import com.java.bank.model.Accounts;

public class SearchAccountMain {
	
	public static void main(String[] args) {
		
		int accountNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter accout number ");
		accountNo = sc.nextInt();
		BankDao dao = new BankDaoImp();
		
		try {
			Accounts bank = dao.searchAccount(accountNo);
			if (bank!=null) {
				System.out.println(bank);
			}else {
				System.out.println("*** Account Numer not found ***");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
