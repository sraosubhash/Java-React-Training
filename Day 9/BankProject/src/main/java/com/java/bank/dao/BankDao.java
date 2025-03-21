package com.java.bank.dao;

import java.sql.SQLException;

import com.java.bank.model.Accounts;

public interface BankDao {
	
	String createAccount(Accounts accounts) throws ClassNotFoundException, SQLException;
	Accounts searchAccount(int accountno) throws ClassNotFoundException, SQLException;
	String closeAccount(int accountno) throws ClassNotFoundException, SQLException;
	String depositAccount(int accountno, double depositeAmount) throws ClassNotFoundException, SQLException;
	String withdrawAccount(int accountno, double withdrawAmount) throws ClassNotFoundException, SQLException;

}
