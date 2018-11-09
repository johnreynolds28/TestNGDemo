package com.test;

import org.testng.annotations.*;

public class Demo7 {

	@Test
	@Parameters({"printed_text"})
	public void parameter_Test(String printed_text) {
		System.out.println(printed_text);
	}
	
}
