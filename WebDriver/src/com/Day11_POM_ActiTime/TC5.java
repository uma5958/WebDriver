package com.Day11_POM_ActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5 {

	public static void main(String[] args) throws Exception {
		//Return to Login page
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/umaheswararao/login.do");
		ActiTimePO at=new ActiTimePO(driver);
		at.ForgotPswd();
		at.SendForGotemail("umakvdu");
		Thread.sleep(500);
		at.ReturnToLogIn();
		//driver.quit();
	}

}
