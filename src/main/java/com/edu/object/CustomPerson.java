package com.edu.object;

/**
 * 
 * @author User
 *
 */
public class CustomPerson extends Person {
	public CustomPerson(int id, String name, int age) {
		super(id, name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		/*
		 * instance of를 쓰면 대칭성이 안 맞아진다.
		 * getClass로 부모 vs 자식 클래스도 명확히 구분한다.
		 */
		if (this.getClass() == obj.getClass()) {
			return isEqualsCustomPerson(this, (CustomPerson)obj);
		} else {
			return false;
		}
	}
	
	private boolean isEqualsCustomPerson(CustomPerson origin, CustomPerson that) {
		return origin.getAge() == that.getAge() &&
				origin.getName().equals(that.getName()) &&
				origin.getId() == that.getId();
	}
}
