package com.ascorp.collections.set;

import java.util.HashSet;

/**
 * <b>1.</b> Elements are inserted based on "HASH-CODE" so insertion order won't
 * fixed.</br>
 * <b>2.</b>In HashSet null is allowed only once, duplicates are not
 * Allowed[Value will be overridden]. </br>
 * <b>3.</b> Best for Retrieval Purpose.
 * 
 * @author KRISHNA
 *
 */
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Object> hashSet = new HashSet<Object>();
		hashSet.add("C");
		hashSet.add("B");
		hashSet.add(null);
		hashSet.add("F");
		hashSet.add("R");
		hashSet.add("R");
		hashSet.add("S");
		hashSet.add("A");
		hashSet.add("W");
		hashSet.add("R");

		System.out.println(hashSet);

	}

}
