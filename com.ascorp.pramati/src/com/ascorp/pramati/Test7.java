package com.ascorp.pramati;

public class Test7 {

	public static void main(String[] args) {

		double d = -10.0 / 0;
		double d1 = 10.0 / -0;
		System.out.println("d---->" + d);
		if (d == Double.POSITIVE_INFINITY) {
			System.out.println("POSITIVE_INFINITY");
		} else {
			System.out.println("Negative_INFINITY");
		}

	}

}
