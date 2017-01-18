package com.edu.algorithm.sort;

import java.util.List;

public class QuickSort {
	public static List<Integer> sort(List<Integer> list) {
		if (list.size() <= 0) {
			return list;
		}
		
		int pivot = list.get(0);
		
		int j = 0;
		for (int i = 1; i < list.size(); i++) {
			// 값이 작을 때만 j(피벗 최종 인덱스)를 증가하고 i와 j를 swap한다
			if (pivot > list.get(i)) {
				j++;
				
				int temp = list.get(j);
				list.set(j, list.get(i));
				list.set(i, temp);
			}
		}
		
		int pivotTemp = list.get(j);
		list.set(j, pivot);
		list.set(0, pivotTemp);
		
		sort(list.subList(0, j));
		sort(list.subList(j + 1, list.size()));
		
		return list;
	}
}
