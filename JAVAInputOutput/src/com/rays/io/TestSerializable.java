package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {

	public static void main(String[] args) throws Exception {

		Student s = new Student("Rays", 1);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("E:\\student.txt"));

		out.writeObject(s);

		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:\\student.txt"));

		s = (Student) in.readObject();

		System.out.println(s);
	}

}
