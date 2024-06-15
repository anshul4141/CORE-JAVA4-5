package com.rays.incapsulationOOP;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.setAccountNo("8987");
		a.setAmount(1000.0);
		a.setType("saving");

		System.out.println("current amount = " + a.getAmount());

		a.deposite(500.0);

		System.out.println("after deposite amount = " + a.getAmount());

		a.withdraw(200.0);

		System.out.println("after withdraw amount = " + a.getAmount());

	}

}
