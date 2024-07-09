package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {

		FileWriter file = new FileWriter("D:\\FirstTest1.txt", true);

		char[] cArray = { 'h', 'i' };

		file.write(cArray);
		file.write("12");
		file.write("Aryan");

		file.close();

		System.out.println("data write successfullyy");

	}

}
