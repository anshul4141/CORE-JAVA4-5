package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadOrWriteBinaryData {

	public static void main(String[] args) throws IOException {

		// for read binary file
		FileInputStream in = new FileInputStream("D:\\Shinchan.jpg");

		// for write binary file
		FileOutputStream out = new FileOutputStream("D:\\Shinchan1.jpg");

		int i = in.read();

		while (i != -1) {

			System.out.println(i);

			out.write(i);

			i = in.read();

		}

		out.close();
		System.out.println("image copy successfully..");

	}

}
