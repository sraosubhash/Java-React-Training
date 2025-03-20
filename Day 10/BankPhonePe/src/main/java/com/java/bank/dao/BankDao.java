package com.java.bank.dao;

import java.sql.SQLException;

import com.java.bank.model.Accounts;

public interface BankDao {
	
	Accounts loginCheck (String user, String pwd) throws ClassNotFoundException, SQLException;
	String phonePe(String mobile, double transferAmount);

}
