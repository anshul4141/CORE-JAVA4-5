package com.rays.thread;

public class DeamonThread extends Thread {

	String name;

	public DeamonThread() {
		// TODO Auto-generated constructor stub
	}

	public DeamonThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		while (true) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}

	}

}
