package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FindCorrectEmail {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("D:\\OldEmail.txt"));

		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\NewEmail.txt"));

		String emailreg = "^[6-9][0-9]{9}$";

		String email = br.readLine();

		while (email.matches(emailreg)) {

			System.out.println(email);

			bw.write(email);

			email = br.readLine();

		}

		bw.close();
		br.close();

		System.out.println("email check successfullyy...");

	}

}
