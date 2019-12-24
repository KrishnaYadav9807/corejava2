package com.ascorp.javalangpackage.immutableobject;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 1. Declare the class as final so it can’t be extended. </br>
 * 2.Make all fields private so that direct access is not allowed. </br>
 * 3.Don’t provide setter methods for variables</br>
 * 4. Make all mutable fields final so that it’s value can be assigned only
 * once.</br>
 * 5.Initialize all the fields via a constructor performing deep copy. </br>
 * 6.Perform cloning of objects in the getter methods to return a copy rather
 * than returning the actual object reference.
 * 
 * @author KRISHNA
 *
 */
public final class ImmutableObject {

	final int id;
	private final String firstname;
	final String lastname;
	final Address address;
	private final ArrayList<Integer> list;

	public ImmutableObject(int id, String firstname, String lastname, Address address, ArrayList<Integer> list) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;

		Address address2 = new Address(address.getZipcode(), address.getPlace(), address.getDistrict(),
				address.getState());

		this.address = address2;
		ArrayList<Integer> list2 = new ArrayList<Integer>(list);

		this.list = list2;
	}

	public int getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public Address getAddress() {
		return address;
	}

	public ArrayList<Integer> getList() {
		return list;
	}

	@Override
	public String toString() {
		return "ImmutableObject [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", address="
				+ address + ",list" + list + "]";
	}

	/*
	 * public static void main(String[] args) { Address address2 = new
	 * Address(221005, "Sunderpur", "Varanasi", "UttarPradesh"); ImmutableObject
	 * immutableObject1 = new ImmutableObject(101, "Krishna", "LastName", address2);
	 * immutableObject1.firstname="AZad"; address2.setZipcode(331005);
	 * System.out.println(immutableObject1);
	 * System.out.println(immutableObject1.hashCode());
	 * 
	 * }
	 */

}
