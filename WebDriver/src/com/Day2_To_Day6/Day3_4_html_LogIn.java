package com.Day2_To_Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_4_html_LogIn {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		
	/*driver.get("file:///E:/WebDriver/jars/html/login.html"); //LogIn.html link
		driver.findElement(By.id("a1")).sendKeys("Hai");
		driver.findElement(By.name("n2")).sendKeys("Hello");
		//driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		Thread.sleep(3000);
		driver.quit();*/
		
		driver.get("file:///E:/Oxygen/jars/html/LogIn_w3schools.html"); //W3school.html link
		driver.findElement(By.name("uname")).sendKeys("Hai");
		driver.findElement(By.name("psw")).sendKeys("Hello");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
