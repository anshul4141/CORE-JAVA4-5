package com.rays.inharitance;

public class ArithmeticOperation {

	public void sum(int a, int b) {

		System.out.println("sum of two int no = " + (a + b));

	}

	public void sum(double a, double b) {

		System.out.println("sum of two double no = " + (a + b));

	}

	public void sum(int a, int b, int c) {

		System.out.println("sum of three no = " + (a + b + c));

	}

	public static void main(String[] args) {

		ArithmeticOperation a = new ArithmeticOperation();

		a.sum(5.0, 10.0);
		a.sum(8, 7, 5);

	}

}
