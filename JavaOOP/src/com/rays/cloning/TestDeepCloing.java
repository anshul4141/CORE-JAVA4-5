package com.rays.cloning;

public class TestDeepCloing implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student s = new Student("Rays", new StudentAddress("Indore"));

		Student s1 = (Student) s.clone();

		s1.name = "NCS";
		s1.city = new StudentAddress("Bhopal");

		System.out.println(s);
		System.out.println(s1);

	}

}
