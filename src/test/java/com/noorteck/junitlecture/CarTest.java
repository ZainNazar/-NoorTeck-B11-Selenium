package com.noorteck.junitlecture;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("@Before");
	}

	@Test
	public void test1() {
		System.out.println("@Test1");
		
	}
	
	@Test
	public void test2() {
		System.out.println("@Test2");
		
	}
	
	@Test
	public void test3() {
		System.out.println("@Test3");
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("@After");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

}
