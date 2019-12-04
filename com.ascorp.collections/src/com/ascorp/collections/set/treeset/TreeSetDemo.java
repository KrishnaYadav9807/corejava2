package com.ascorp.collections.set.treeset;

import java.util.TreeSet;

/**
 * <b>1.</b> In TreeSet homogeneous object will be inserted Based on Default
 * Natural Sorting Order.</br>
 * <b>2.</b> Null Insertion is not possible if tried will throw
 * "NullPointerException".</br>
 * 
 * @author KRISHNA
 *
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Object> treeSet = new TreeSet<>();
		treeSet.add("C");
		treeSet.add("B");
		treeSet.add("F");
		treeSet.add("R");
		treeSet.add("R");
		treeSet.add("S");
		treeSet.add("A");
		treeSet.add("W");
		treeSet.add("R");
		// treeSet.add(null);

		System.out.println(treeSet);
	}
}
