package com.rays.incapsulationOOP;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setAccountNo("8987");
		a.setAmmount(1000.0);
		a.setType("saving");
		
		System.out.println("current amount = " + a.getAmmount());
		
		a.deposite(500.0);
		
		System.out.println("after deposite amount = " + a.getAmmount());
		
		a.withdraw(2000.0);
		
		System.out.println("after withdraw amount = " + a.getAmmount());
		
	}

}
