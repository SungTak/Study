package com.edu.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	public static List<Integer> sort(List<Integer> list) {
		return divide(list);
	}
	
	private static List<Integer> divide(List<Integer> list) {
		if (list.size() == 1) {
			return list;
		}
		
		int mid = list.size() / 2;
		
		List<Integer> leftlist = divide(list.subList(0, mid));
		List<Integer> rightlist = divide(list.subList(mid, list.size()));
		return merge(leftlist, rightlist);
	}
	
	private static List<Integer> merge(List<Integer> leftlist, List<Integer> rightlist) {
		List<Integer> mergelist = new ArrayList<>();
		
		int i = 0;
		int j = 0;
		while (i < leftlist.size() && j < rightlist.size()) {
			if (leftlist.get(i) > rightlist.get(j)) {
				mergelist.add(rightlist.get(j));
				j++;
			} else {
				mergelist.add(leftlist.get(i));
				i++;
			}
		}
		
		while (i < leftlist.size()) {
			mergelist.add(leftlist.get(i));
			i++;
		}
		
		while (j < rightlist.size()) {
			mergelist.add(rightlist.get(j));
			j++;
		}
		
		return mergelist;
	}
}
