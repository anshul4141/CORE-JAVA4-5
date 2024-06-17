package com.rays.inharitance;

public class CircleByConstructor extends ShapeByConstructor {

	private int radius;

	public CircleByConstructor() {

	}

	public CircleByConstructor(int radius) {

		this.radius = radius;

	}

	public int getRadius() {
		return radius;
	}

	public double area() {

		double area = 3.14 * radius * radius;

		return area;

	}

	public static void main(String[] args) {

		CircleByConstructor c = new CircleByConstructor(2);

		ShapeByConstructor s = new ShapeByConstructor("red", 5);

		System.out.println("radius = " + c.getRadius());

		System.out.println("area = " + c.area());

	}

}
