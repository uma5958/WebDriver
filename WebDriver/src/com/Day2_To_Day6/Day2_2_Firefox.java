package com.Day2_To_Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day2_2_Firefox {
	public static void main(String[] args) throws InterruptedException {
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
						
			driver.get("http://www.seleniumhq.org/");
			//for Firefox by default browser will be in auto max state
			//driver.manage().window().maximize(); 
			driver.navigate().to("http://www.seleniumhq.org/download/");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			driver.quit();
			}
	}
}
