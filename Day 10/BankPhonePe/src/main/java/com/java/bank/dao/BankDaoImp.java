package com.java.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.bank.model.Accounts;
import com.java.bank.util.ConnectionHelper;

public class BankDaoImp implements BankDao{
	
	Connection connection;
	PreparedStatement pst;
	int accountNo;

	@Override
	public Accounts loginCheck(String user, String pwd) throws ClassNotFoundException, SQLException {
		String cmd = "select * from Accounts where userName = ? and passcode = ?";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setString(2, pwd);
		ResultSet rs = pst.executeQuery();
		Accounts accounts = null;
		if(rs.next()) {
			accounts = new Accounts();
			accounts.setAccountNo(rs.getInt("AccountNo"));
			accounts.setAccHolderName(rs.getString("accHolderName"));
			accounts.setUsername(rs.getString("userName"));
			accounts.setPassword(rs.getString("PassCode"));
			accounts.setEmail(rs.getString("email"));
			accounts.setMobileNo(rs.getString("mobileNo"));
			accounts.setAmount(rs.getDouble("Amount"));
			accountNo = accounts.getAccountNo();
		}
		return accounts;
		
		
	}

	@Override
	public String phonePe(String mobile, double transferAmount) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
