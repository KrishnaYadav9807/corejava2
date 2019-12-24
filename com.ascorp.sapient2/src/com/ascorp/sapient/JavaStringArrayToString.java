package com.ascorp.sapient;

import java.util.Arrays;

public class JavaStringArrayToString {

	public static void main(String[] args) {
		String[] strArr =  { "1", "2", "3" };

		String str = Arrays.toString(strArr);
		System.out.println("Java String array to String = " + str);

		str = convertStringArrayToString(strArr);
		System.out.println("Convert Java String array to String = " + str);

	}

	private static String convertStringArrayToString(String[] strArr) {
		StringBuilder sb = new StringBuilder();
		for (String str : strArr)
			sb.append(str);
		return sb.substring(0, sb.length() );
	}
}