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
	
	public int generateAccountNo() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		
		String cmd = "select case when max(accountno) is null then 1 else max(accountno)+1 end accno from accounts;";
		
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int accno = rs.getInt("accno");
		return accno;
	}
	
	

	@Override
	public String createAccount(Accounts accounts) throws ClassNotFoundException, SQLException {
		
		connection = ConnectionHelper.getConnection();
		int id = generateAccountNo();
		String cmd = "insert into Accounts(Accountno,FirstName,LastName,City,State,Amount,CheqFacil,AccountType) values (?,?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, id);
		pst.setString(2, accounts.getFirstName());
		pst.setString(3, accounts.getLastName());
		pst.setString(4, accounts.getCity());
		pst.setString(5, accounts.getState());
		pst.setDouble(6, accounts.getAmount());
		pst.setString(7, accounts.getCheqFacil());
		pst.setString(8, accounts.getAccountType());
		pst.executeUpdate();
		return "Account created with account no : "+id;		
	}



	@Override
	public Accounts searchAccount(int accountno) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Accounts where Accountno = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountno);
		ResultSet rs = pst.executeQuery();
		Accounts accounts = null;
		if(rs.next()) {
			accounts = new Accounts();
			accounts.setAccountNo(rs.getInt("accountno"));
			accounts.setFirstName(rs.getString("FirstName"));
			accounts.setLastName(rs.getString("LastName"));
			accounts.setCity(rs.getString("city"));
			accounts.setAmount(rs.getDouble("Amount"));
			accounts.setCheqFacil(rs.getString("CheqFacil"));
			accounts.setAccountType(rs.getString("accountType"));
			accounts.setStatus(rs.getString("status"));
			accounts.setDateOfOpen(rs.getDate("DateOfOpen"));
		}
		return accounts;
	}



	@Override
	public String closeAccount(int accountno) throws ClassNotFoundException, SQLException {
		
		Accounts accounts = searchAccount(accountno);
		if(accounts!=null) {
			String cmd = "update Accounts set status = 'inactive' where accountno = ?";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, accountno);
			pst.executeUpdate();
			return "Account closed";
		}
		return "Account number not found";
		
	}



	@Override
	public String depositAccount(int accountno, double depositeAmount) throws ClassNotFoundException, SQLException {
		Accounts accounts = searchAccount(accountno);
		if(accounts!=null) {
			String cmd = "update Accounts set amount = amount + ? where accountno = ?";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setDouble(1, depositeAmount);
			pst.setInt(2, accountno);
			pst.executeUpdate();
			cmd = "Insert into Trans(Accountno, TransAmount, TransType) values (?,?,?)";
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, accountno);
			pst.setDouble(2, depositeAmount);
			pst.setString(3, "C");
			pst.executeUpdate();
			return "Amount credicted sucessfully";
		}
		
		return "Account number not found";
		
	}



	@Override
	public String withdrawAccount(int accountno, double withdrawAmount) throws ClassNotFoundException, SQLException {
		
		Accounts accounts = searchAccount(accountno);
		if (accounts!=null) {
			double balance = accounts.getAmount();
			if (balance - withdrawAmount >= 0) {
				String cmd = "update Accounts set amount = amount - ? where accountno = ?";
				connection = ConnectionHelper.getConnection();
				pst = connection.prepareStatement(cmd);
				pst.setDouble(1, withdrawAmount);
				pst.setInt(2, accountno);
				pst.executeUpdate();
				cmd = "Insert into Trans(Accountno, TransAmount, TransType) values (?,?,?)";
				pst=connection.prepareStatement(cmd);
				pst.setInt(1, accountno);
				pst.setDouble(2, withdrawAmount);
				pst.setString(3, "D");
				pst.executeUpdate();
				return "Amount Debited sucessfully";
			}
			
			return "Account balance innsuffient";
			
		}
		
		return "Account number not found";
		
	}

}
