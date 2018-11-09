package com.test;

import org.testng.annotations.*;

public class Demo6 {
	

	@Test (groups = {"group_two"})
	public void c_Test() {
		System.out.println("Test Method C - Passed Test, Demo6");
	}

	@Test (groups = {"group_one"})
	public void d_Test() {
		System.out.println("Test Method D - Failed Test, Demo6");
		assert(false);
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("This comes before the test! - Demo6");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("This comes after the test! - Demo6");
	}
	
	@BeforeMethod (groups = {"group_two"})
	public void BeforeMethod() {
		System.out.println("This comes before each method! - Demo6");
	}
	
	@AfterMethod (groups = {"group_one", "group_two"})
	public void AfterMethod() {
		System.out.println("This comes after each method! - Demo6");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("This comes before this class - Demo6");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("This comes before this class - Demo6");
	}
}
