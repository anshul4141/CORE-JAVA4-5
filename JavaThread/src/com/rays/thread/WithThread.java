package com.rays.thread;

public class WithThread extends Thread {

	String name;

	public WithThread() {
		// TODO Auto-generated constructor stub
	}

	public WithThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println(i + " " + name);

		}
	}

	public static void main(String[] args) {

		WithThread t1 = new WithThread("xyz");
		WithThread t2 = new WithThread("abc");

		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t2.start();

	}

}
