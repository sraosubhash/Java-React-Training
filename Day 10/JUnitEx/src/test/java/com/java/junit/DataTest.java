package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {

	@Test
	public void testSayHello() {
		Data data = new Data();
		assertEquals("Welcome to Junit...", data.sayHello());
	}
	
	@Test
	public void testSum() {
		Data data = new Data();
		assertEquals(5, data.sum(2, 3));
	}
	
	@Test
	public void testMax() {
		Data data = new Data();
		assertEquals(5, data.max3(5,2,3));
		assertEquals(5, data.max3(2,5,3));
		assertEquals(5, data.max3(2,3,5));
	}
	
	@Test
	public void testArrayEquals() {
		int [] a = {1,2,3};
		int [] b = {1,2,3};
		assertArrayEquals(a, b);
	}
	
	@Test
	public void testEvenOdd() {
		Data data = new Data();
		assertTrue(data.evenOdd(4));
		assertFalse(data.evenOdd(5));
	}
	
	@Test
	public void testShow() {
		Data data = new Data();
		assertNotNull(data.show(1));
		//assertNotNull(data.show(10));
	}

}
