package com.rays.incapsulationOOP;

public class Account {

	String accountNo;
	double ammount;
	String type;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getAmmount() {
		return ammount;
	}

	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double deposite(double depositeAmount) {

		return ammount = ammount + depositeAmount;

	}

	public double withdraw(double withdrawAmount) {

		if (withdrawAmount > ammount) {

			System.out.println("insufficient balance");

		} else {

			return ammount = ammount - withdrawAmount;

		}

		return ammount;

	}

}
