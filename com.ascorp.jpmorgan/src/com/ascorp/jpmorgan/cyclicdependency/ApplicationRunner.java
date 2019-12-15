package com.ascorp.jpmorgan.cyclicdependency;

public class ApplicationRunner {

	public static void main(String[] args) {
		Building building = new Building();
		building.setFloor(50);
		Lift lift = new Lift(building);
		building.setLift(lift);

		System.out.println(building.getFloor() + "     " + building.getLift().getSpeed());
		;
		// System.out.println(building.toString());

	}
}
