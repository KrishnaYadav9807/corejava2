package com.ascorp.hackerrankchallenge.palindrome;

import java.util.Arrays;

public class AnagramCheck {

	static boolean isAnagram(String firstString, String secondString) {
		char[] firstStringCharArray = firstString.toLowerCase().toCharArray();
		java.util.Arrays.sort(firstStringCharArray);
		char[] SecondStringCharArray = secondString.toLowerCase().toCharArray();
		Arrays.sort(SecondStringCharArray);

		String firstString1 = new String(firstStringCharArray);
		String secondString2 = new String(SecondStringCharArray);

		return firstString1.contains(secondString2);

	}

	public static void main(String[] args) {
		System.out.println(AnagramCheck.isAnagram("aa", "aaaaa"));
		;
	}

}
