package com.Day2_To_Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_1_FEB_tagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("file:///E:/Oxygen/jars/html/MyGoogle.html");
		
		/*By b = By.tagName("a");
		WebElement e = driver.findElement(b);
		e.click();*/
		
		driver.findElement(By.tagName("a")).click();

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
