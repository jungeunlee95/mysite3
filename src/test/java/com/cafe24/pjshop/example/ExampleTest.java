package com.cafe24.pjshop.example;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ExampleTest {
	
	// 테스트 케이스(메소드)끼리 공유해야 할 변수가 있으면 스태틱 선언
	private static StringBuilder output = new StringBuilder();
	
	@BeforeClass
	public static void setUpBefor() {
		System.out.println("@BeforeClass : " + output.toString());
	}
	
	@AfterClass
	public static void tearDownAfter() {
		System.out.println("@AfterClass : " + output.toString());
	}
	
	@Before 
	public void setUp() {
	System.out.println("Before");
	}

	@After
	public void tearDown() {
	System.out.println("After");
	} 
	 
	@Test
	public void myATest() {
		System.out.println("@Test:A");
		output.append("C");
	}
	
	@Test 
	public void myBTest() {
		System.out.println("@Test:B");
		output.append("B");
	}
	
	@Test 
	public void myCTest() {
		System.out.println("@Test:C");
		output.append("A");
		
	}
	
	/**
	 * assertXYZ 테스트
	 */
	
	// 테스트 무시
	@Ignore
	@Test
	public void ignoreTest() {
		assertTrue(false);
	}
	
	@Test
	public void testAssert1() {
		Object[] a = {"Java", "JUnit", "Spring"};
		Object[] b = {"Java", "JUnit", "Spring"};
		
		assertArrayEquals(a, b);
	}
	
	@Test
	public void testAssert() {
		assertTrue(1 == 10-9);
		assertFalse(2 == 10-9);
		
		assertNull(null);
		assertNotNull(new Object());
		
		assertEquals("aa", "aa");
		assertEquals(1, 1);
		assertEquals(new String("hello"), "hello");
		assertNotEquals(true, false);
		
		assertSame("Hello", "Hello");
		assertNotSame(new String("Hello"), "Hello");
		assertNotSame(new Integer(1), 1);
		
		// assertThat
		// - is, is not 
		assertThat(1+2, is(3));
		assertThat("this is never", is(not("that")));
		
		// - allOf
		assertThat("Hello World", allOf(startsWith("Hell"), containsString("lo")));

		// - anyOf
		assertThat("Hello World", anyOf(startsWith("Heaven"), containsString("lo")));
		
		// - both
		assertThat("ABC", both(containsString("A")).and(containsString("B")));
		
		// - either
		assertThat("ABC", either(containsString("A")).or(containsString("X")));
		
		// - everyItem
		assertThat(Arrays.asList("Apple", "Apartment", "Application"), everyItem(startsWith("Ap")));
		
		// - hasItem
		assertThat(Arrays.asList("Apple", "Apartment", "BABO"), hasItem(startsWith("Ap")));

//		fail("All Over!!!!!!!!!!");
	}

	

}

















