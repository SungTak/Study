package com.edu.algorithm.search;

import java.util.List;

public class BinarySearch {
	public static int search(List<Integer> list, int low, int high, int findNumber) {
		int mid = (high + low) / 2;
		int foundNumber = -1;
		
		if (low >= high) {
			return foundNumber;
		}
		
		if (list.get(mid) > findNumber) {
			foundNumber = search(list, low, mid, findNumber);
		} else if (list.get(mid) < findNumber) {
			foundNumber = search(list, mid + 1, high, findNumber);
		} else {
			foundNumber = list.get(mid);
		}
		return foundNumber;
	}
}
