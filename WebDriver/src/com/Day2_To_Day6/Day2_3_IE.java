package com.Day2_To_Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Day2_3_IE {
	public static void main(String[] args) throws InterruptedException {
		{
			System.setProperty("webdriver.ie.driver", "./Drivers/IEdriverserver.exe");
			WebDriver driver=new InternetExplorerDriver();
			
			driver.get("http://www.seleniumhq.org");
			driver.manage().window().maximize();
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
