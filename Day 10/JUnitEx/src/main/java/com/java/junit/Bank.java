package com.java.junit;

import java.util.Date;

enum AccountType{
	SAVING, CURRENT, RECURRING
}

enum CheqFacil{
	YES, NO
}

public class Bank {
	
	private int accountNo;
	public String accountHoldername;
	private Date dateOfOpen;
	private String username;
	private String password;
	private String mobileNo;
	private int optCode;
	private String status;
	private AccountType accountType;
	private CheqFacil cheqFacil;
	private double amount;
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(int accountNo, String accountHoldername, Date dateOfOpen, String username, String password,
			String mobileNo, int optCode, String status, AccountType accountType, CheqFacil cheqFacil, double amount) {
		super();
		this.accountNo = accountNo;
		this.accountHoldername = accountHoldername;
		this.dateOfOpen = dateOfOpen;
		this.username = username;
		this.password = password;
		this.mobileNo = mobileNo;
		this.optCode = optCode;
		this.status = status;
		this.accountType = accountType;
		this.cheqFacil = cheqFacil;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Bank [accountNo=" + accountNo + ", accountHoldername=" + accountHoldername + ", dateOfOpen="
				+ dateOfOpen + ", username=" + username + ", password=" + password + ", mobileNo=" + mobileNo
				+ ", optCode=" + optCode + ", status=" + status + ", accountType=" + accountType + ", cheqFacil="
				+ cheqFacil + ", amount=" + amount + "]";
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHoldername() {
		return accountHoldername;
	}

	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}

	public Date getDateOfOpen() {
		return dateOfOpen;
	}

	public void setDateOfOpen(Date dateOfOpen) {
		this.dateOfOpen = dateOfOpen;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getOptCode() {
		return optCode;
	}

	public void setOptCode(int optCode) {
		this.optCode = optCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public CheqFacil getCheqFacil() {
		return cheqFacil;
	}

	public void setCheqFacil(CheqFacil cheqFacil) {
		this.cheqFacil = cheqFacil;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}

