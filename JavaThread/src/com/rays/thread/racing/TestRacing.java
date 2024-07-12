package com.rays.thread.racing;

public class TestRacing {

	public static void main(String[] args) {
		AccountHolder t1 = new AccountHolder("Aryan");
		AccountHolder t2 = new AccountHolder("Suraj");

		t1.start();
		t2.start();

	}

}
