package com.rays.javabasic;

public class E7 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 100; i < 200; i++) {

			if (i % 7 == 0) {

				sum = sum + i;

				// System.out.println(sum);

			}

		}

		System.out.println(sum);

	}

}
