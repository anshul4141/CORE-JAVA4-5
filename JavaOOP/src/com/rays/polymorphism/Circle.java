package com.rays.polymorphism;

public class Circle extends Shape {

	private int radius;

	public Circle() {

	}

	public Circle(int radius) {

		this.radius = radius;

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {

		double area = PI * Math.pow(radius, 2);
		
		System.out.println(area);

		return area;

	}

}
