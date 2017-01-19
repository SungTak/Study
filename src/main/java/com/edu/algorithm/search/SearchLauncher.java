package com.edu.algorithm.search;

import java.util.Arrays;
import java.util.List;

public class SearchLauncher {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 25, 40, 60, 100);
		
		Integer result = BinarySearch.search(list, 0, list.size(), 13);
		System.out.println(result);
	}
}
