package com.Day2_To_Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day4_2_FEB_Attributes {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/Oxygen/jars/html/MyGoogle.html");
		
		//driver.findElement(By.tagName("a")).click(); //PASS
		//driver.findElement(By.id("a1")).click(); //PASS
		//driver.findElement(By.name("n1")).click(); //PASS
		//driver.findElement(By.className("c1")).click(); //PASS
		//driver.findElement(By.linkText("MyGoogleLink")).click(); //PASS
		//driver.findElement(By.partialLinkText("My")).click(); //PASS
		//driver.findElement(By.partialLinkText("Link")).click(); //PASS
		driver.findElement(By.partialLinkText("Google")).click(); //PASS
		//driver.findElement(By.partialLinkText("MyLink")).click(); //FAIL - NoSuchElementException
		
		String title = driver.getTitle();
		if (title.equals("Google")) {
			System.out.println("Title is Google; Test is PASS");
		} else {
			System.out.println("Title is Not Google; Test is Fail");
		}
		
		String url = driver.getCurrentUrl();
		if (url.contains("https://www.google.co.in")) {
			System.out.println("Url is matching; Test PASS");
		} else {
			System.out.println("Url is Not matching; Test FAIL");
		}
		driver.close();
	}
}