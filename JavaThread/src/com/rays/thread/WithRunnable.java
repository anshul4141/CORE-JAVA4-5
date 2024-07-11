package com.rays.thread;

public class WithRunnable implements Runnable {

	String name;

	public WithRunnable() {
		// TODO Auto-generated constructor stub
	}

	public WithRunnable(String name) {

		this.name = name;

	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(10000);
				System.out.println(i + " " + name);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {

		Thread t = new Thread(new WithRunnable("xyz"));
		Thread t2 = new Thread(new WithRunnable("abc"));

		t.start();
		t2.start();

		t.setPriority(10);
		t2.setPriority(1);

	}

}
