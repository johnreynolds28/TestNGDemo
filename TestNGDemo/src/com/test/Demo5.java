package com.test;

import org.testng.annotations.*;

@Listeners(com.test.ListenerClass.class)
public class Demo5 {
	
	@Test (groups = {"group_one", "group_two"}, priority = 1)
	public void a_Test() {
		System.out.println("Test Method A");
	}

	@Test (groups = {"group_two"}, priority = 0)
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
	
	@BeforeMethod (groups = {"group_one", "group_two"})
	public void BeforeMethod() {
		System.out.println("This comes before each method!");
	}
	
	@AfterMethod (groups = {"group_one", "group_two"})
	public void AfterMethod() {
		System.out.println("This comes after each method!");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("This comes before this class");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("This comes before this class");
	}
}
