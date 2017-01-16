package com.edu.algorithm.sort;

import java.util.List;

/**
 * j는 계속 내려가면서 자기보다 큰 값이 나오면 스왑을 계속하다가(마치 insert하는것같음)
 * 없으면 stop한다
 * 
 * @author User
 *
 */
public class InsertionSort {
	public static List<Integer> sort(List<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (list.get(i) > list.get(j)) {
					int temp = list.get(j);
					list.set(j, list.get(i));
					list.set(i, temp);
				} else {
					break;
				}
				i--;
			}
			
		}
		
		return list;
	}
}
