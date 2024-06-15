package com.rays.incapsulationOOP;

public class Person2 {

	private String name = "";
	private int age = 0;
	private String address = "";

	public Person2() {
		System.out.println("this is default constructor");
	}

	public Person2(String name, int age, String address) {

		this.name = name;
		this.age = age;
		this.address = address;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

}
