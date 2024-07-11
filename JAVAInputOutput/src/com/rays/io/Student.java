package com.rays.io;

import java.io.Serializable;

public class Student implements Serializable {

	String name;
	transient int id;

	public Student() {
	}

	public Student(String name, int id) {

		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + "";
	}

}
