package com.rays.inharitance;

public class Shape {

	private String color;
	private int borderWidth;

	public static double PI = 3.14;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public double area() {
		return 0.0;
	}

}
