package com.rays.polymorphism;

public class ConstrutorCalling {

	private String fname;
	private String lname;
	private String address;

	public ConstrutorCalling() {
		System.out.println("this is default constructor...");
	}

	public ConstrutorCalling(String fname, String lname) {

		this();
		this.fname = fname;
		this.lname = lname;
		System.out.println("fname = " + this.fname);
		System.out.println("lname = " + this.lname);

	}

	public ConstrutorCalling(String fname, String lname, String address) {

		this(fname, lname);
		this.address = address;
		System.out.println("address = " + this.address);

	}

}
