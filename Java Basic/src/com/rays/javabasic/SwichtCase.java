package com.rays.javabasic;

public class SwichtCase {

	public static void main(String[] args) {

		String month = "Dec";

		switch (month) {

		case "Jan":
			System.out.println("this is jan");
			break;
		case "Feb":
			System.out.println("this is feb");
			break;
		case "March":
			System.out.println("this is March");
			break;
		case "Jun":
			System.out.println("this is Jun");
		default:
			System.out.println("Month is not available");
			break;
		}

	}

}
