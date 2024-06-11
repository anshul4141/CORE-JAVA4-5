package com.rays.javabasic;

public class LoginPassword {

	public static void main(String[] args) {

		String loginId = "abc@gmail.com";
		String password = "pass1234";

		if (loginId == "" && password == "") {

			System.out.println("Login Id is required");
			System.out.println("Password is required");

		} else if (loginId == "abc@gmail.com" && password == "pass123") {

			System.out.println("login successfully");

		} else {
			System.out.println("invalid login id password");
		}

	}

}
