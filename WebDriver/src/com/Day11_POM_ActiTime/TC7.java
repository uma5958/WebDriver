package com.Day11_POM_ActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TC7 {
	public static void main(String[] args) {
		//Add Recent Tasks 
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/umaheswararao/login.do");
		ActiTimePO at=new ActiTimePO(driver);
		at.Login("umakvdu", "umakvdu");
		at.AddRecentTask();
		RemoteWebDriver r=(RemoteWebDriver) driver; //down Casting
		String c="window.scrollTo(0, document.body.scrollHeight)";
		r.executeScript(c);
		//driver.quit();
	}

}
