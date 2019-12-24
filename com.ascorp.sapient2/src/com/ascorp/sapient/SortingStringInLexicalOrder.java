package com.ascorp.sapient;

public class SortingStringInLexicalOrder {

	static String stringCom(String str1, String str2, String str3) {
		String[] words = new String[] { str1, str2, str3 };
		int n = 3;

		for (int i = 0; i < n - 1; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if (words[i].compareTo(words[j]) > 0) {
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		// return str3;
		for (int i = 0; i < n; i++) {
			System.out.print(words[i]);
			// return words[i] ;
		}
		return convertStringArrayToString(words);

	}

	private static String convertStringArrayToString(String[] strArr) {
		StringBuilder sb = new StringBuilder();
		for (String str : strArr)
			sb.append(str);
		return sb.substring(0, sb.length());
	}

	public static void main(String[] args) {
		SortingStringInLexicalOrder.stringCom("ab", "ac", "aa");
		// System.out.println(Test1.stringCom("ab", "ac", "aa"));
	}

}
