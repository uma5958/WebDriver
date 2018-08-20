package com.Day2_To_Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_3_xpath_with_Attributes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/WebDriver/jars/html/xpath-1.html");
		
		//xpath with Attributes
		driver.findElement(By.xpath("//input[@id='a1']")).sendKeys("Hi");
		driver.findElement(By.xpath("//input[@name='n1']")).sendKeys("Welcome To");
		driver.findElement(By.xpath("//input[@type='text'][@id='a3']")).sendKeys("Course Cube");
		driver.findElement(By.xpath("//input[@type='text' and @id='a4']")).sendKeys("Marathahalli");
		driver.findElement(By.xpath("//a[@href='https://www.google.co.in/']")).click();
		
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("Google")) {
			System.out.println("Title Matched; Test PASS");
		} else {
			System.out.println("Title Not Matched; Test FAIL");
		}
		driver.close();
	}
}
