package com.test;

import org.testng.annotations.*;

public class Demo3 {
	

	@Test (groups = {"group_one", "group_two"})
	public void a_Test() {
		System.out.println("Test Method A - Passed Test, Demo3");
	}

	@Test (groups = {"group_two"})
	public void b_Test() {
		System.out.println("Test Method B - Failed Test, Demo3");
		assert(false);
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("This comes before the test! - Demo3");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("This comes after the test! - Demo3");
	}
	
	@BeforeMethod (groups = {"group_one", "group_two"})
	public void BeforeMethod() {
		System.out.println("This comes before each method! - Demo3");
	}
	
	@AfterMethod (groups = {"group_two"})
	public void AfterMethod() {
		System.out.println("This comes after each method! - Demo3");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("This comes before this class - Demo3");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("This comes before this class - Demo3");
	}
}
