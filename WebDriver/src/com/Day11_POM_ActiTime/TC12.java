package com.Day11_POM_ActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC12 {
	public static void main(String[] args) throws InterruptedException {
		//Calender -> Select Current Week
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/umaheswararao/login.do");
		ActiTimePO at=new ActiTimePO(driver);
		at.Login("umakvdu", "umakvdu");
		at.Calender();
		//driver.quit();
	}

}
