package com.Day10_Handling_MultipleElements_and_ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day10_6_Handling_ListBox_SelectClass {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Handling List Box
		driver.get("E:/Oxygen/jars/html/ListBox.html");
		Select s=new Select(driver.findElement(By.id("list")));
		Thread.sleep(1000);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByValue("IND");
		Thread.sleep(1000);
		s.selectByVisibleText("South Africa");
		Thread.sleep(1000);
		
		s.deselectByIndex(1);
		Thread.sleep(1000);
		s.deselectByValue("IND");
		Thread.sleep(1000);
		s.deselectByVisibleText("South Africa");
		Thread.sleep(1000);
		//s.deselectAll();
		
		driver.quit();
	}
}


