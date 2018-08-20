package com.Day12_testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Day11_POM.LoginPagePO;

public class TestNG_4_ActiTime_Login_Logout {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeMethod
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver, 10);
	}
	@Test
	public void Login() {
		driver.get("https://online.actitime.com/umaheswararao/login.do");
		LoginPagePO login=new LoginPagePO(driver);
		login.Login("umakvdu", "umakvdu");
		wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		String eTitle=driver.getTitle();
		String aTitle="actiTIME - Enter Time-Track";
		Assert.assertEquals(aTitle, eTitle);
	}
	@AfterMethod
	public void CloseBrowser() {
		driver.close();
	}
}
