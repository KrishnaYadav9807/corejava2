package com.ascorp.collections.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_DescendingOrder {
	public static void main(String[] args) {
		TreeSet<Object> treeSet = new TreeSet<>(new Comparator<Object>() {

			@Override
			public int compare(Object object1, Object object2) {
				String string1 = object1.toString();
				String string2 = object2.toString();

				return string2.compareTo(string1);
			}
		});
		treeSet.add("C");
		treeSet.add("B");
		treeSet.add("F");
		treeSet.add("R");
		treeSet.add("R");
		treeSet.add("Y");
		treeSet.add("U");
		treeSet.add("W");
		treeSet.add("S");
		treeSet.add("A");
		treeSet.add("Z");
		treeSet.add("R");
		// treeSet.add(null);

		System.out.println(treeSet);
	}
}
