package com.qa.main;

public abstract class Car extends Vehicle {

	public abstract void doors();

	private int headLights = 2;

	public Car() {
	}

	public Car(int wheels, int speed, String type) {
		this.setWheels(wheels);
		this.setSpeed(speed);
		this.setType(type);
	}

	public int getHeadLights() {
		return headLights;
	}

	public void setHeadLights(int headLights) {
		this.headLights = headLights;
	}

}
