package com.Day11_POM_ActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TC6 {
	public static void main(String[] args) {
		//Send Text and Save Changes
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/umaheswararao/login.do");
		ActiTimePO at=new ActiTimePO(driver);
		at.LoginwithRememberMe("umakvdu", "umakvdu");
		at.AddTasksByName("Uma");
		RemoteWebDriver r=(RemoteWebDriver) driver; //down Casting
		String c="window.scrollTo(0, document.body.scrollHeight)";
		r.executeScript(c);
		at.SaveChanges();
		//driver.quit();
	}

}
