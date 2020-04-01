package com.qa.main;

public abstract class Plane extends Vehicle {

	public abstract void turbines();

	private int wings = 2;

	public Plane() {
	}

	public Plane(int wheels, int speed, String type) {
		this.setWheels(wheels);
		this.setSpeed(speed);
		this.setType(type);
	}

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

}
