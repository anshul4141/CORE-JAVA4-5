package com.rays.cloning;

public class Student implements Cloneable {

	public String name;
	public StudentAddress city;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, StudentAddress city) {

		this.name = name;
		this.city = city;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Student s = (Student) super.clone();

		s.city = (StudentAddress) city.clone();

		return s;

	}

	@Override
	public String toString() {
		return "name=" + name + ", city=" + city + "";
	}

}
