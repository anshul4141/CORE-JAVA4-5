package com.rays.collection;

public class Employee {

	private String name;
	private int salary;
	private String address;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int salary, String address) {

		this.name = name;
		this.salary = salary;
		this.address = address;

	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public String getAddress() {
		return address;
	}

}
