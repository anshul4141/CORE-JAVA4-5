package com.rays.collection;

public class TestFuctinalInt {

	public static void main(String[] args) {

		FunctionalInt f = new FunctionalInt() {

			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};

		int a = 20;
		int b = 10;

		System.out.println(f.sum(a, b));
		FunctionalInt.hello();
		f.hello2();

	}

}
