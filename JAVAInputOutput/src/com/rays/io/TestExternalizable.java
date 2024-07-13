package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalizable {
	public static void main(String[] args) throws Exception {

		Student2 s = new Student2(1, "rays");

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("E:\\student.txt"));

		out.writeObject(s);

		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:\\student.txt"));

		s = (Student2) in.readObject();

		System.out.println(s.getId() + " " + s.getName());
	}

}
