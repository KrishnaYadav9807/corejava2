package com.ascorp.hackerrankchallenge.palindrome;

public class Palindrom {

	static String palindromCheck(String originalString) {
		StringBuffer original1 = new StringBuffer(originalString);
		StringBuffer reversedStringBuffer = original1.reverse();

		if (originalString.contentEquals(reversedStringBuffer) == true)
			return "Yes";

		return "No";
	}

	public static void main(String[] args) {
		System.out.println(Palindrom.palindromCheck("MADAMM"));

		/*
		 * String s1="Krishna"; String s2="Yadav"; s1.contentEquals(sb)
		 */
	}
}
