package com.rays.inharitance;

public class Circle extends Shape {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		double area = PI * radius * radius;
		return area;
	}

	public static void main(String[] args) {

		Circle c = new Circle();

		c.setRadius(2);
		c.setColor("red");
		c.setBorderWidth(5);

		System.out.println("radius = : " + c.getRadius());
		System.out.println("color = : " + c.getColor());
		System.out.println("borderWidth = " + c.getBorderWidth());

		double a = c.area();

		System.out.println("area = " + a);

	}

}
