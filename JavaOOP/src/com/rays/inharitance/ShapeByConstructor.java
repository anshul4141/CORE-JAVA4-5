package com.rays.inharitance;

public class ShapeByConstructor {

	private String color;
	private int borderWidth;

	public ShapeByConstructor() {
		// TODO Auto-generated constructor stub
	}

	public ShapeByConstructor(String color, int borderWidth) {

		this.color = color;
		this.borderWidth = borderWidth;

	}

	public String getColor() {
		return color;
	}

	public int getBorderWidth() {

		return borderWidth;

	}

}
