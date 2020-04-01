package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		Ford ford = new Ford();
		Car car = ford;
		/// Vehicle type = car;

		List<Vehicle> garage = new ArrayList<Vehicle>();

		garage.add(ford);
		garage.add(new TukTuk());
		garage.add(new Bugatti());
		garage.add(new Boeing());
		garage.add(new HarmonyOfTheSeas());

		for (Vehicle a : garage) {
			// a.doors();
			System.out.println(a.getClass().getSimpleName());
			System.out.println(a.getType());
			System.out.println(a.getWheels());
			System.out.println(a.getSpeed());

			if (a instanceof Car) { // Methods unique to car
				((Car) a).doors();
			} else if (a instanceof Plane) { // Methods unique to car
				((Plane) a).turbines();
			} else if (a instanceof Boat) { // Methods unique to car
				((Boat) a).decks();
			}

			System.out.println("-----------------------");
		}

	}

}
