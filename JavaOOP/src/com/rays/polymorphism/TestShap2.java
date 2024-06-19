package com.rays.polymorphism;

// test shape by array with constructor
public class TestShap2 {

	public static void main(String[] args) {

		Shape[] s = new Shape[2];

		s[0] = new Circle(5);
		s[1] = new Rectangle(7, 6);

		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}

	}

}
