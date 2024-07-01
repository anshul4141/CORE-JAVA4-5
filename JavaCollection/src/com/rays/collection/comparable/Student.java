package com.rays.collection.comparable;

public class Student implements Comparable<Student> {

	private String name;
	private int id;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int id) {

		this.name = name;
		this.id = id;

	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Student o) {

		// return this.id - o.id; // compare student by id
		// return o.id - this.id;

		if (this.id == o.id) {

			return this.name.compareTo(o.name);

		} else {

			return this.id - o.id;

		}
	}

}
