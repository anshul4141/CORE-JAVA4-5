package com.rays.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWritePrimitiveData {

	public static void main(String[] args) throws IOException {

		// for write primitive data
		DataOutputStream out = new DataOutputStream(new FileOutputStream("D://Primitive.txt"));

		out.writeInt(5);
		// out.writeInt(6);
		out.writeBoolean(true);
		out.writeDouble(55.0);
		out.writeShort(1);

		out.close();
		System.out.println("data write successfully..");

		DataInputStream in = new DataInputStream(new FileInputStream("D://Primitive.txt"));

		System.out.println(in.readBoolean());
		System.out.println(in.readInt());
		System.out.println(in.readShort());
		System.out.println(in.readDouble());

	}

}
