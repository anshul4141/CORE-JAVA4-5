package com.rays.thread.racing;

public class BOBBank {

	private int balance;

	public int getBalance() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balance;
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.balance = balance;
	}

	public synchronized void deposite(String name, int amount) {

		int total = balance + amount;

		setBalance(total);

		System.out.println(name + " " + total);

	}

}
