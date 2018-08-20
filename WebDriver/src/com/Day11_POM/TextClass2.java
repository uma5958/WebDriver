package com.Day11_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextClass2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/umaheswararao/login.do");
		LoginPagePO login=new LoginPagePO(driver);
		login.LoginwithRememberMe("umakvdu", "umakvdu");
		
		driver.quit();
	}
}
