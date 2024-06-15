package com.rays.incapsulationOOP;

public class Account {

	private String accountNo;
	private double amount;
	private String type;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double deposite(double depositeAmount) {

		return amount = amount + depositeAmount;

	}

	public double withdraw(double withdrawAmount) {

		return amount = amount - withdrawAmount;

	}

}
