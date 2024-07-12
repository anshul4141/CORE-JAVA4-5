package com.rays.thread.racing;

public class AccountHolder extends Thread {

	String name;

	public static BOBBank b = new BOBBank();

	public AccountHolder() {
		// TODO Auto-generated constructor stub
	}

	public AccountHolder(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			b.deposite(name, 1000);
		}

	}

}
