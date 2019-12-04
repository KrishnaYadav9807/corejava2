package com.ascorp.javalangpackage;

public class PalindromString {

	static String reverseString(String originalString) {
		System.out.println("OriginalString Is:   " + originalString);
		String originalStringInLowerCase = originalString.toLowerCase();

		char[] charArray = originalStringInLowerCase.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = charArray.length - 1; i >= 0; i--) {
			stringBuilder.append(charArray[i]);
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		String ckeckPalindrom = PalindromString.toCkeckPalindrom("12121");
		System.out.println(ckeckPalindrom);
	}

	public static String toCkeckPalindrom(String ispalindromString) {

		String ispalindromStringInLowerCase = ispalindromString.toLowerCase();
		String reverseString = PalindromString.reverseString(ispalindromStringInLowerCase);
		System.out.println("reverseString Is:   " + reverseString);

		boolean equals = reverseString.equals(ispalindromStringInLowerCase);
		if (equals == true) {
			return "Yes! It is Palindrom.";
		} else
			return "Ohh!!! It is Not a Palindrom.";

	}

}
