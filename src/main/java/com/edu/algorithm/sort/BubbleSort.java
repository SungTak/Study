package com.edu.algorithm.sort;

import java.util.List;

/**
 * 가장 큰거 뒤로보내느거야
 * 
 * @author User
 *
 */
public class BubbleSort {
	public static List<Integer> sort(List<Integer> list) {
		for (int count = 0; count < list.size(); count++) {
			for (int i = 0; i < list.size() - 1; i++) {
				int j = i + 1;
				
				if (list.get(i) > list.get(j)) {
					int temp = list.get(j);
					list.set(j, list.get(i));
					list.set(i, temp);
				}
			}
		}
		return list;
	}
}
