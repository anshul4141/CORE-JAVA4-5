package com.rays.thread;

public class TestDeamonThread {

	public static void main(String[] args) {

		DeamonThread t = new DeamonThread("DeamonThread...");

		t.setDaemon(false);

		t.start();

		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("main");
		}

	}

}
