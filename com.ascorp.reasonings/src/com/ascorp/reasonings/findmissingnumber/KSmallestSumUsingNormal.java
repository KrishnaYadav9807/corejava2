package com.ascorp.reasonings.findmissingnumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class KSmallestSumUsingNormal {

	// function to display first K
	// maximum sum combinations
	static int[] KMaxCombinations(int A[], int B[], int Q) {
		int N = A.length;
		// max heap.
		TreeSet<Integer> treeset = new TreeSet<Integer>();

		// insert all the possible
		// combinations in max heap.
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				treeset.add(A[i] + B[j]);
		System.out.println(treeset);

		ArrayList<Integer> arrayList = new ArrayList<>();
		Object[] treeSetArray = treeset.toArray();

		for (int i = 0; i < Q; i++) {
			arrayList.add((Integer) treeSetArray[i]);
		}

		System.out.println("arrayList...>>>>" + arrayList);

		int[] primitive = arrayList.stream().mapToInt(Integer::intValue).toArray();

		return primitive;

	}

	public static int[] convertIntegers(List<Integer> integers) {
		int[] ret = new int[integers.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = integers.get(i).intValue();
		}
		return ret;
	}

	public static void main(String[] args) {
		int A[] = { 3, 2 };
		int B[] = { 1, 4 };
		/*
		 * int A[] = { 4, 2, 5, 1 }; int B[] = { 8, 0, 3, 5 };
		 */
		int Q = 2;
		// int Q = 3;

		int[] kMaxCombinations = KMaxCombinations(A, B, Q);

		System.out.println("From Driver Code--->" + Arrays.toString(kMaxCombinations));

	}
}
