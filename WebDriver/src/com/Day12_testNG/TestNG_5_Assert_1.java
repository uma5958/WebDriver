package com.Day12_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_5_Assert_1 {
	@Test
	public void Test() {
		SoftAssert s=new SoftAssert();
		Reporter.log("Step1", true);
		s.assertEquals("abc", "xyz");
		Reporter.log("Step2", true);
		s.assertAll(); //Should be at the end
	}
}
