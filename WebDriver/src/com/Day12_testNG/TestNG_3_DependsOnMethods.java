package com.Day12_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_3_DependsOnMethods {
	@Test(priority=1)
	public void Register() {
		Reporter.log("Create User", true);
		//Assert.fail();
	}
	@Test(priority=2, dependsOnMethods= {"Register"})
	public void DeleteUser() {
		Reporter.log("Delete User", true);
	}
}
