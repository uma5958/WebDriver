package com.Day2_To_Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_1_Absolute_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/WebDriver/jars/html/xpath-1.html");
		
		//Absolute xpath
		driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("Hi");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("Welcome To");
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("Course Cube");
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Marathahalli");
		driver.findElement(By.xpath("html/body/div[3]/a")).click();
		
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("Google")) {
			System.out.println("Title Matched; Test PASS");
		} else {
			System.out.println("Title Not Matched; Test FAIL");
		}
		driver.close();
	}

}
