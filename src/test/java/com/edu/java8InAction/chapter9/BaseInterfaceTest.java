package com.edu.java8InAction.chapter9;

import static org.junit.Assert.*;

import org.junit.Test;

public class BaseInterfaceTest {
	@Test
	public void testLamda() throws Exception {
		BaseInterface lamda = (a) -> a + 2;
		assertEquals(4, lamda.getNumber(2));
	}

	@Test
	public void testDefault() throws Exception {
		BaseInterface lamda = (a) -> a + 2;
		assertEquals(1, lamda.getOne());
	}
	
	@Test
	public void testStatic() throws Exception {
		assertEquals(2, BaseInterface.getTwo());
	}
	
	@Test
	public void testOverride() throws Exception {
		BaseInterface obj = new BaseInterface() {
			@Override
			public int getNumber(int number) {
				return 0;
			}
			
			@Override
			public int getOne() {
				return -1;
			}
		};
		
		assertEquals(2, BaseInterface.getTwo());
		assertEquals(-1, obj.getOne());
		assertEquals(0, obj.getNumber(2));
	}
}
