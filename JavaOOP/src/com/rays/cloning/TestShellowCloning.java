package com.rays.cloning;

public class TestShellowCloning implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee e = new Employee("Rays", "Madhumilansqure");

		// System.out.println(e);

		Employee e1 = (Employee) e.clone();

		e1.setName("NCS");
		e1.setAddress("JawraCompund");

		System.out.println(e);
		System.out.println(e1);

	}

}
