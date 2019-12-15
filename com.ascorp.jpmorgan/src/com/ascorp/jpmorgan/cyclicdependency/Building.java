package com.ascorp.jpmorgan.cyclicdependency;

public class Building implements IBuilding {

	private int floor;
	private Lift lift;

	public Building() {
		Lift lift2 = new Lift(this);
		setFloor(40);
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public Lift getLift() {
		return lift;
	}

	public void setLift(Lift lift) {
		this.lift = lift;
	}

	@Override
	public String toString() {
		return "Building [floor=" + floor + ", lift=" + lift + "]";
	}

}
