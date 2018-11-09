package com.test;

import org.testng.annotations.*;

public class Demo4 {
	

	@Test (priority = 4)
	public void a_Test() {
		System.out.println("Test Method A");
	}

	@Test (priority = 5)
	public void b_Test() {
		System.out.println("Test Method B");
	}
	@Test (priority = 1)
	public void c_Test() {
		System.out.println("Test Method C");
	}

	@Test (priority = 6)
	public void d_Test() {
		System.out.println("Test Method D");
	}
	@Test (priority = 3)
	public void e_Test() {
		System.out.println("Test Method E");
	}

	@Test (priority = 2)
	public void f_Test() {
		System.out.println("Test Method F");
	}
	
	@Test (priority = 0)
	public void a2_Test() {
		System.out.println("Test Method A");
	}

	@Test (priority = 0)
	public void b2_Test() {
		System.out.println("Test Method B");
	}
	@Test (priority = 0)
	public void c2_Test() {
		System.out.println("Test Method C");
	}

	@Test (priority = 0)
	public void d2_Test() {
		System.out.println("Test Method D");
	}
	@Test (priority = 0)
	public void e2_Test() {
		System.out.println("Test Method E");
	}

	@Test (priority = 0)
	public void f2_Test() {
		System.out.println("Test Method F");
	}
	
	@Test (priority = 0)
	public void underline_Test() {
		System.out.println("----------------------------");
	}
}
