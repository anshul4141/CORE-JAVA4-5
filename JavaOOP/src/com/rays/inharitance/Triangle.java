package com.rays.inharitance;

public class Triangle extends Shape {

	private double base;
	private double hight;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public double area() {

		double area = base * hight / 2;

		return area;

	}

	public static void main(String[] args) {

		Triangle t = new Triangle();

		t.setBorderWidth(2);
		t.setColor("blue");
		t.setBase(2);
		t.setHight(2);

		System.out.println("area = " + t.area());

	}
}
