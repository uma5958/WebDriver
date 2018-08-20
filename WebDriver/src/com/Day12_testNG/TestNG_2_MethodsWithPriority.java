package com.Day12_testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_2_MethodsWithPriority {
	@BeforeClass
	public void OpenApp() {
		Reporter.log("Launch The APP", true);
	}
	@AfterClass
	public void CloseApp() {
		Reporter.log("Close The APP", true);
	}
	@BeforeMethod
	public void AdminLogin() {
		Reporter.log("Admin Login", true);
	}
	@AfterMethod
	public void AdminLogout() {
		Reporter.log("Admin Logout", true);
	}
	@Test(priority=1)
	public void Register() {
		Reporter.log("New Register", true);
	}
	@Test(priority=2)
	public void LoinCheck() {
		Reporter.log("Login Check for New user", true);
	}
	@Test(priority=3)
	public void EditUser() {
		Reporter.log("Edit user", true);
	}
	@Test(priority=4)
	public void DeleteUser() {
		Reporter.log("Delete user", true);
	}
	
}
