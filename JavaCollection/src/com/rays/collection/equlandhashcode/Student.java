package com.rays.collection.equlandhashcode;

public class Student {

	private String name;
	private Integer id;
	private Integer marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int id, int marks) {
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	@Override
	public boolean equals(Object obj) {

		Student s = (Student) obj;

		boolean b = this.name.equals(s.name) && this.id.equals(s.id) && this.marks.equals(s.marks);

		return b;
	}

	@Override
	public int hashCode() {

		String key = this.name + this.id + this.marks;

		return key.hashCode();

	}

}
