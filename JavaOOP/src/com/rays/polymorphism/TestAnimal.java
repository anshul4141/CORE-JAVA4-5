package com.rays.polymorphism;

public class TestAnimal {

	public static void main(String[] args) {

		Animal a1 = new Dog();
		Animal a2 = new Cat();

		a1.sound();
		a2.sound();

	}

}
