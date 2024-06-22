package com.rays.polymorphism;

public class TestConstructor extends ConstrutorCalling {

	public TestConstructor() {
		
		super();

	}

	public TestConstructor(String fname, String lname, String address) {

		super(fname, lname, address);

	}

	public static void main(String[] args) {

		TestConstructor t = new TestConstructor("Ram", "Sharma", "Indore");

	}

}
