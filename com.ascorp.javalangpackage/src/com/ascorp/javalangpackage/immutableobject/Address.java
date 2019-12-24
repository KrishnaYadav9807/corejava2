package com.ascorp.javalangpackage.immutableobject;

public class Address {

	private int zipcode;
	private String place;
	private String district;
	private String state;

	public Address(int zipcode, String place, String district, String state) {
		super();
		this.zipcode = zipcode;
		this.place = place;
		this.district = district;
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [zipcode=" + zipcode + ", place=" + place + ", district=" + district + ", state=" + state + "]";
	}

}
