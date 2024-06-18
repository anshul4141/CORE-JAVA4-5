package com.rays.inharitance;

import java.awt.geom.Area;

public class Rectangle extends Shape {

	private double l;
	private double b;

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public double area() {

		double area = l * b;

		return area;

	}
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		
		r.setColor("red");
		r.setBorderWidth(5);
		r.setL(4);
		r.setB(7);
		
		System.out.println("area = " + r.area());
		
	}
}
