package com.rays.exception;

public class UncheckedException {

	public static void main(String[] args) {

		dad();

	}

	private static void dad() {

		try {
			mom();
		} catch (RuntimeException e) {
			System.out.println("mistake mad by son, Catch by dad " + e.getMessage());
		}

	}

	private static void mom() {

		son();

	}

	private static void son() {

		throw new RuntimeException("Mistake...");

	}

}
