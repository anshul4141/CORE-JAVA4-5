package com.rays.cloning;

public class Employee implements Cloneable {

	private String name;
	private String address;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String address) {

		this.name = name;
		this.address = address;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	@Override
	public String toString() {
		return "name=" + name + ", address=" + address + "";
	}

}
