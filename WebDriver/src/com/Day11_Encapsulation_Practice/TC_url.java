package com.Day11_Encapsulation_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_url {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/umaheswararao/login.do");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		EC_Login l=new EC_Login(driver);
		l.Login("umakvdu", "umakvdu");
		EC_url u=new EC_url(driver);
		u.url();
		driver.quit();
	}

}
