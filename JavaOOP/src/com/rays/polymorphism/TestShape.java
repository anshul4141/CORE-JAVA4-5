package com.rays.polymorphism;

// testShape simple
public class TestShape {

	public static void main(String[] args) {

		Shape s1 = new Circle(2);
		Shape s2 = new Rectangle(5.0, 6.0);

		s1.area();
		s2.area();

	}

}
