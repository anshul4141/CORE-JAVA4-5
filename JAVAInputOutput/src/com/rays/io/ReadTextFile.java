package com.rays.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("D:\\FirstTest.txt");

		int i = fr.read();

		char ch;

		while (i != -1) {

			ch = (char) i;

			System.out.print(ch);

			i = fr.read();

		}

	}

}
