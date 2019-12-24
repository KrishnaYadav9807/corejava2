package com.ascorp.hackerrankchallenge.palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String originalString = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		System.out.println(Palindrome.palindromCheck(originalString));

	}

	static String palindromCheck(String originalString) {
		StringBuffer original1 = new StringBuffer(originalString);
		StringBuffer reversedStringBuffer = original1.reverse();

		if (originalString.contentEquals(reversedStringBuffer) == true)
			return "Yes";

		return "No";
	}
}
