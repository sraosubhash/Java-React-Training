package com.java.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.bank.dao.BankDao;
import com.java.bank.dao.BankDaoImp;
import com.java.bank.model.Accounts;

public class LoginCheckMain {
	
	public static void main(String[] args) {
		String user, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName ");
		user = sc.next();
		System.out.println("Enter Password ");
		pwd = sc.next();
		BankDao dao = new BankDaoImp();
		try {
			Accounts accounts = dao.loginCheck(user, pwd);
			if (accounts!=null) {
				System.out.println("Correct Credentials...");
			}else {
				System.out.println("Invalid Credentials...");
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
