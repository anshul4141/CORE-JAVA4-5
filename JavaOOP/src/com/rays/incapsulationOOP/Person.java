package com.rays.incapsulationOOP;

public class Person {

	private String firstName = "";
	private String lastName = "";
	private int age = 0;
	private String address = "";
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public void setName(String name1, String name2) {
		this.firstName = name1;
		this.lastName = name2;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
