package com.rays.cloning;

public class StudentAddress implements Cloneable {

	public String address;

	public StudentAddress() {
		// TODO Auto-generated constructor stub
	}

	public StudentAddress(String address) {

		this.address = address;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	@Override
	public String toString() {
		return "address=" + address + "";
	}

}
