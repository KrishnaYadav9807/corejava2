package com.ascorp.jpmorgan.hirevue;

import java.io.IOException;
import java.util.Scanner;

public class Square {
	/**
	 * Iterate through each line of input.
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number Of Which You want to find Square:  ");

		//For Taking String as Input
		String s = scanner.next();
		
		int nextInt = scanner.nextInt();
		System.out.println("Square Of The Number Is:  " + nextInt * nextInt);

	}
}