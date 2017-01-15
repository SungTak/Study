package com.edu.java8.chapter3;

public class Application {
	public static void main(String[] args) {
		repeat(10, i -> { System.out.println("CountDown: " + (9 - i)); });
//		repeat(10, System.out::println);
	}
	
	public static void repeat(int n, IntConsumer action) {
		for (int i = 0; i < n; i++) {
			action.accept(i);
		}
	}
}
