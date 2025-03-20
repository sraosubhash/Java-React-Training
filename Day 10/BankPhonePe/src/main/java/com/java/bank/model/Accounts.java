package com.java.bank.model;

public class Accounts {
	
	private int accountNo;
	private String accHolderName;
	private String username;
	private String password;
	private String email;
	private String mobileNo;
	private double amount;
	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accounts(int accountNo, String accHolderName, String username, String password, String email,
			String mobileNo, double amount) {
		super();
		this.accountNo = accountNo;
		this.accHolderName = accHolderName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobileNo = mobileNo;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Accounts [accountNo=" + accountNo + ", accHolderName=" + accHolderName + ", username=" + username
				+ ", password=" + password + ", email=" + email + ", mobileNo=" + mobileNo + ", amount=" + amount + "]";
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
