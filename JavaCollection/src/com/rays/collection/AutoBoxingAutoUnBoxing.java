package com.rays.collection;

public class AutoBoxingAutoUnBoxing {

	public static void main(String[] args) {

		// AutoBoxing
		int a = 5;

		Integer i = new Integer(a);

		System.out.println(i);

		// AutoUnBoxing

		Integer a1 = new Integer(6);

		int i1 = a1;

		System.out.println(i1);

	}

}
