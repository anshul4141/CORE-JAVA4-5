package com.rays.polymorphism;

// test shape by array with getter or setter method
public class TestShap3 {

	public static void main(String[] args) {

		Shape[] s = new Shape[2];

		s[0] = new Circle();
		s[1] = new Rectangle();

		Circle c = (Circle) s[0];
		c.setRadius(2);

		Rectangle r = (Rectangle) s[1];
		r.setL(5);
		r.setB(6);

		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}

	}
}