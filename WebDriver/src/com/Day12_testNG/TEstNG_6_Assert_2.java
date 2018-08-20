package com.Day12_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TEstNG_6_Assert_2 {
	@Test
	public void Test12() {
		SoftAssert s=new SoftAssert();
		Reporter.log("Step1", true);
		s.assertEquals("abc", "xyz");
		//Assert.assertEquals("abc", "xyz");
		Reporter.log("Step2", true);
		s.assertAll();
	}
}
