package com.qa.main;

public class Ford extends Car {

	public Ford() {
		super(4, 160, "Car");
	}

	@Override
	public void doors() {
		System.out.println("Has doors");

	}
}
