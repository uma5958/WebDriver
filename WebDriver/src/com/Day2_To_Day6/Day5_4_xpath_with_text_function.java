package com.Day2_To_Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_4_xpath_with_text_function {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/WebDriver/jars/html/Text%20function_Links.html");
		
		//xpath with text() function
		driver.findElement(By.xpath("//a[text()='My Google']")).click();
		Thread.sleep(2000);
		String title1 = driver.getTitle();
		if (title1.contains("Google")) {
			System.out.println("Google -> PASS");
		} else {
			System.out.println("Google -> FAIL");
		}
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='My Facebook']")).click();
		Thread.sleep(2000);
		String title2= driver.getTitle();
		if (title2.contains("Facebook")) {
			System.out.println("Facebook -> PASS");
		} else {
			System.out.println("Facebook -> FAIL");
		}
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='My SeleniumHq']")).click();
		Thread.sleep(2000);
		String title3= driver.getTitle();
		if (title3.contains("Selenium")) {
			System.out.println("Selenium -> PASS");
		} else {
			System.out.println("Selenium -> FAIL");
		}
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='My Naukri']")).click();
		Thread.sleep(2000);
		String title4= driver.getTitle();
		if (title4.contains("Naukri")) {
			System.out.println("Naukri -> PASS");
		} else {
			System.out.println("Naukri -> FAIL");
		}
		driver.navigate().back();
		Thread.sleep(2000);
		
		System.out.println("***ALL LINKS WORKING PROPERLY***");
		driver.quit();
		}
}
