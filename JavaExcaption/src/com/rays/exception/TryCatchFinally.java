package com.rays.exception;

public class TryCatchFinally {

	public static void main(String[] args) {

		String[] str = { "a", "b", "c" };
		int i = 5;

		try {

			System.out.println(str[3]);

		} catch (NullPointerException e) {

			System.out.println("NullPointerExcetion " + e.getMessage());

			System.exit(0);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("ArrayIndexOutOfBoundsException " + e.getMessage());

			// System.exit(0);

		}

		finally {

			System.out.println("this is finaly block");

		}

	}

}
