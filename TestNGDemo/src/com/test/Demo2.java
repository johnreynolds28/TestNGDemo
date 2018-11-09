package com.test;

import org.testng.annotations.*;

public class Demo2 {
	

	@Test
	public void a_Test() {
		System.out.println("Test Method A");
	}

	@Test
	public void b_Test() {
		System.out.println("Test Method B");
		assert(false);
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("This comes before the test!");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("This comes after the test!");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("This comes before each method!");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("This comes after each method!");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("This comes before this class");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("This comes after this class");
	}
}
