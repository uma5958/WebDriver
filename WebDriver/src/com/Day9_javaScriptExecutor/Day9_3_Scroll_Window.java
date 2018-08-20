package com.Day9_javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Day9_3_Scroll_Window {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org/");
		
		RemoteWebDriver r=(RemoteWebDriver) driver; //down Casting
		
		//String c="window.scrollBy(0, 2000)";
		//String c="window.scrollBy(0, document.body.scrollHeight)";
		String c="window.scrollTo(0, document.body.scrollHeight)";
		Thread.sleep(2000);
		r.executeScript(c);
		Thread.sleep(2000);
		
		driver.quit();
	}
}
