package com.Day11_Encapsulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Login_Logout2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://online.actitime.com/umaheswararao/login.do");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		EC_LogInPage2 l= new EC_LogInPage2(driver);
		l.login("umakvdu", "umakvdu");
		EC_LogOut h=new EC_LogOut(driver);
		h.Logout();
		driver.quit();
	}

}
