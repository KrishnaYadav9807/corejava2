package com.ascorp.collections.set;

import java.util.LinkedHashSet;

/**
 * <b>Exactly Same As HASH SET</b></br>
 * <b>1.</b> Insertion order is preserved.</br>
 * <b>2.</b>In HashSet null is allowed only once, duplicates are not
 * Allowed[Value will be overridden]. </br>
 * 
 * @author KRISHNA
 *
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("C");
		linkedHashSet.add("B");
		linkedHashSet.add(null);
		linkedHashSet.add("F");
		linkedHashSet.add("R");
		linkedHashSet.add("R");
		linkedHashSet.add("S");
		linkedHashSet.add("A");
		linkedHashSet.add("W");
		linkedHashSet.add("R");
		linkedHashSet.add(null);

		System.out.println(linkedHashSet);
	}

}
