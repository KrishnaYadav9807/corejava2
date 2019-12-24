package com.ascorp.javalangpackage.immutableobject;

import java.util.ArrayList;

public class ApplicationRunner {
	public static void main(String[] args) {
		Address address2 = new Address(221005, "Sunderpur", "Varanasi", "UttarPradesh");
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(2222222);
		ImmutableObject immutableObject1 = new ImmutableObject(101, "Krishna", "Yadav", address2, arrayList);
		// immutableObject1.firstname="AZad";
		address2.setZipcode(331005);
		arrayList.add(33333);
		System.out.println(immutableObject1);
		System.out.println(immutableObject1.hashCode());

	}
}
