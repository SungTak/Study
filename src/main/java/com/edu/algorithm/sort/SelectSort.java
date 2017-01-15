package com.edu.algorithm.sort;

import java.util.List;

/**
 * 교환은 작은걸 찾으면 바로바꾸고
 * 선택은 작은 인덱스를 찾아서 사이클이 돌면 교환
 * @author User
 *
 */
public class SelectSort {
	public static List<Integer> sort(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int minIndex = i;
			
			for (int j = i; j < list.size(); j++) {
				if (list.get(minIndex) > list.get(j)) {
					minIndex = j;
				}
			}
			int temp = list.get(minIndex);
			list.set(minIndex, list.get(i));
			list.set(i, temp);
		}
		return list;
	}
}
