package com.rays.io;

import java.io.File;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) {

		File file = new File("D:\\FirstTest.txt");

		System.out.println(file.exists());

		if (file.exists()) {

			System.out.println("File name = " + file.getName());
			System.out.println("File path = " + file.getAbsolutePath());
			System.out.println("Can wirte this file = " + file.canWrite());
			System.out.println("Can read this file = " + file.canRead());

			Date d = new Date(file.lastModified());
			System.out.println("Last modified date = " + d);

			System.out.println(file.length());

		} else {

			System.out.println("file does not exists");

		}

	}

}
