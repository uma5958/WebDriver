package com.Day9_javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Day9_4_Scroll_To_Perticular_Element {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org/");
		
		//Finding the location of the element
		int y = driver.findElement(By.className("downloadBox")).getLocation().getY();
		
		RemoteWebDriver r=(RemoteWebDriver) driver; //down Casting
		
		String c="window.scrollTo(0, "+y+")";
		Thread.sleep(2000);
		r.executeScript(c);
		Thread.sleep(2000);
		driver.quit();
	}
}
