package com.rays.javabasic;

public class RandomNo {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			double d = Math.random() * 100;

			int a = (int) d;

			System.out.println(a);

		}

	}

}
