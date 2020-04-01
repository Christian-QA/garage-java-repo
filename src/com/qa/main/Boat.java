package com.qa.main;

public abstract class Boat extends Vehicle {

	public abstract void decks();

	public Boat() {
	}

	public Boat(int wheels, int speed, String type) {
		this.setWheels(wheels);
		this.setSpeed(speed);
		this.setType(type);
	}

}
