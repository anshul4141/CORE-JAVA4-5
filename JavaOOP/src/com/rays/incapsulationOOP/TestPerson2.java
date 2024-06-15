package com.rays.incapsulationOOP;

public class TestPerson2 {

	public static void main(String[] args) {

		Person2 p = new Person2("Suraj", 20, "Indore");

		System.out.println("name =" + p.getName());
		System.out.println("age = " + p.getAge());
		System.out.println("address = " + p.getAddress());

		Person2 p2 = new Person2();

	}

}
