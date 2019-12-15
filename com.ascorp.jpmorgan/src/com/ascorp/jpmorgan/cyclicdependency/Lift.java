package com.ascorp.jpmorgan.cyclicdependency;

public class Lift {

	private int speed;
	private IBuilding building;

	public Lift(Building b) {
		this.building = b;
		setSpeed(10);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (building.getFloor() > 20) {
			this.speed = 5;
		} else {
			this.speed = 20;
		}
	}

}
