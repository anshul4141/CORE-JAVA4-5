package com.rays.javabasic;

public class TypeCasting {

	public static void main(String[] args) {

		String id = "55";

		try {

			int i = Integer.parseInt(id);

			System.out.println(i);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		int i = 6;

		String s = String.valueOf(i);

		// String s = Integer.toString(i);

		System.out.println(s);

	}

}
