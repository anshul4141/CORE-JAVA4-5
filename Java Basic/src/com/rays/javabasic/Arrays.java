package com.rays.javabasic;

public class Arrays {

	public static void main(String args[]) {

		int[] i = { 2, 5, 6, 5 };

		int a = 5;

		int temp = -1;

		for (int j = 0; j < i.length; j++) {

			if (a == i[j]) {

				temp = j;

			}

		}

		System.out.println(temp);

	}

}
