package com.edu.algorithm.sort;

import java.util.Arrays;
import java.util.List;

public class SortLauncher {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 7, 4, 2, 6, 1, 9, 8, 5, 3);
		List<Integer> ascSortlist = SelectSort.sort(list);
		
		ascSortlist.stream().forEach(System.out::print);
	}
}
