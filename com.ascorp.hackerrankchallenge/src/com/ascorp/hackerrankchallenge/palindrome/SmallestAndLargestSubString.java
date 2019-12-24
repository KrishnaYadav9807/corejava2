package com.ascorp.hackerrankchallenge.palindrome;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SmallestAndLargestSubString {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		java.util.TreeSet<String> sets = new TreeSet<String>();
		for (int i = 0; i <= s.length() - k; i++) {
			sets.add(s.substring(i, i + k));
		}
		System.out.println(sets.first());
		System.out.println(sets.last());
		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}