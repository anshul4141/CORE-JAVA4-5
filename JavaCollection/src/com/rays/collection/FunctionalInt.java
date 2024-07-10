package com.rays.collection;

@FunctionalInterface
public interface FunctionalInt {

	public int sum(int a, int b);

	public static void hello() {

		System.out.println("this is static method");

	}

	public default void hello2() {

		System.out.println("this is default method");

	}

}
