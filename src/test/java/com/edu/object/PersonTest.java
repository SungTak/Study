package com.edu.object;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {
	@Test
	public void testEquals() throws Exception {
		Person seongTak = new Person(1, "성탁", 30);
		Person seongTak2 = new Person(1, "성탁", 30);
		
		assertNotSame(seongTak, seongTak2);
		assertNotEquals(seongTak, seongTak2);
	}
}
