package com.edu.java8InAction.chapter9;

@FunctionalInterface
public interface BaseInterface {
	int getNumber(int number);
	
	// 인터페이스에 새 기능을 추가해도 바이너리 호환성때문에 
	// 하위 클래스가 구현하지 않아도 실제로 에러는 발생하지 않음(툴에서만 에러)
	// 다만 전체 빌드(컴파일)을 하거나 신규 메서드를 호출하게되면 그 땐 에러가 발생함
//	int getNumber2(int number);
	
	default int getOne() {
		return 1;
	}
	
	static int getTwo() {
		return 2;
	}
}
