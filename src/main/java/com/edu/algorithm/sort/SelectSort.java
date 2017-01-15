package com.edu.algorithm.sort;

import java.util.List;

public class SelectSort {
	public static List<Integer> sort(List<Integer> list) {
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = i; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					int minValue = list.get(j);
					list.set(j, list.get(i));
					list.set(i, minValue);
				}
			}
		}
		
		return list;
	}
} 
