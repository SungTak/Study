package com.edu.algorithm.sort;

import java.util.Arrays;
import java.util.List;

public class SortLauncher {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 7, 4, 2, 6, 1, 9, 8, 5, 3);
//		List<Integer> ascSortlist = ExchangeSort.sort(list);
//		List<Integer> ascSortlist = SelectSort.sort(list);
//		List<Integer> ascSortlist = BubbleSort.sort(list);
//		List<Integer> ascSortlist = InsertionSort.sort(list);
//		List<Integer> ascSortlist = MergeSort.sort(list);
		List<Integer> ascSortlist = QuickSort.sort(list);
		
		ascSortlist.stream().forEach(System.out::print);
	}
}
