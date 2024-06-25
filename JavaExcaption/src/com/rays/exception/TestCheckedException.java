package com.rays.exception;

public class TestCheckedException {

	public static void main(String[] args) {

		dad();

	}

	private static void dad() {

		try {
			mom();
		} catch (Exception e) {
			System.out.println("mistake mad by son, Catch by dad " + e.getMessage());
		}

	}

	private static void mom() throws Exception {

		son();

	}

	private static void son() throws Exception {

		throw new Exception("Mistake...");

	}

}
