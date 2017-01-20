package com.edu.object;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomPersonTest {
	@Test
	public void testEquals() throws Exception {
		CustomPerson seongtak = new CustomPerson(1, "성탁", 30);
		CustomPerson seongtak2 = new CustomPerson(1, "성탁", 30);
		
		// equals를 호출하지 않고 == 비교이다.
		assertNotSame(seongtak, seongtak2);
		
		assertEquals(seongtak, seongtak2);
		
		assertTrue(seongtak.equals(seongtak));
		assertTrue(seongtak.equals(seongtak2));
		assertTrue(seongtak2.equals(seongtak));
		
		CustomPerson seongtak2nd = new CustomChildren(1, "성탁", 30);
		assertFalse(seongtak.equals(seongtak2nd));
		assertFalse(seongtak2nd.equals(seongtak));
	}
}
