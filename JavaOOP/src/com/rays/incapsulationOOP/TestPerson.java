package com.rays.incapsulationOOP;

public class TestPerson {

	public static void main(String[] args) {

		Person p = new Person();

		p.setName("Aryan", "Shrivastav");
		p.setAge(20);
		p.setAddress("Indore");

		System.out.println("Name = " + p.getName());
		System.out.println("age = " + p.getAge());
		System.out.println("address = " + p.getAddress());

	}

}
