package com.Day2_To_Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_3_CSS_Selector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Oxygen/jars/html/MyGoogle.html");
		
		//driver.findElement(By.cssSelector("a[href='https://www.google.co.in/']")).click(); //PASS
		//driver.findElement(By.cssSelector("a[id='a1']")).click(); //PASS
		//driver.findElement(By.cssSelector("a[name='n1']")).click(); //PASS
		driver.findElement(By.cssSelector("a[class='c1']")).click(); //PASS
		
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
