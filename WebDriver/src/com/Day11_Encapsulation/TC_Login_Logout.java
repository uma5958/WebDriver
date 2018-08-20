package com.Day11_Encapsulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Login_Logout {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://online.actitime.com/umaheswararao/login.do");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		EC_LogInPage l= new EC_LogInPage(driver);
		l.setUserName("umakvdu");
		l.setPassword("umakvdu");
		l.ClickLogInBtn();
		EC_LogOut lo=new EC_LogOut(driver);
		lo.Logout();
		
	}

}
