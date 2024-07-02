package com.rays.collection.equlandhashcode;

public class TestEqualHasCode {

	public static void main(String[] args) {

		Student s1 = new Student("Rays", 50, 100);
		Student s2 = new Student("Rays", 100, 50);

		System.out.println(s1.equals(s2));

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
