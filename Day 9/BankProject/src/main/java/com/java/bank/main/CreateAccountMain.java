package com.java.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.bank.dao.BankDao;
import com.java.bank.dao.BankDaoImp;
import com.java.bank.model.Accounts;

public class CreateAccountMain {
	
	public static void main(String[] args) {
		
		Accounts account = new Accounts();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First name ");
		account.setFirstName(sc.next());
		System.out.println("Enter Last name ");
		account.setLastName(sc.next());
		System.out.println("Enter city ");
		account.setCity(sc.next());
		System.out.println("Enter state ");
		account.setState(sc.next());
		System.out.println("Enter Ammount ");
		account.setAmount(sc.nextDouble());
		System.out.println("Enter Cheq Falci ");
		account.setCheqFacil(sc.next());
		System.out.println("Enter Account type ");
		account.setAccountType(sc.next());
		
		BankDao dao = new BankDaoImp();
		
		try {
			System.out.println(dao.createAccount(account));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
