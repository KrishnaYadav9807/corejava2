package com.ascorp.pramati;

public class Test {

	public static void main(String[] args) {
		int[] a = { 1 };
		Test t = new Test();
		t.increment(a);
		System.out.println("#2...a.length-1----->" + (a.length - 1));
		System.out.println(a[a.length - 1]);
	}

	void increment(int[] i) {
		System.out.println("#1...Inside Increament-->" + i.length);
		i[i.length - 1]++;
		System.out.println("i[0]--->" + i[0]);
	}

}
