package com.rays.collection;

public class TestLemdaExpression {

	public static void main(String[] args) {

		FunctionalInt f = (a, b) -> {
			return a + b;
		};

		int a = 10;
		int b = 20;

		System.out.println(f.sum(a, b));

	}

}
