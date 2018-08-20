package com.Day7_ActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S7_ApproveTimeTrack {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// Scenario 1 - Verify Login with valid credentials 
		driver.get("https://online.actitime.com/umaheswararao/login.do");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("umakvdu");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("umakvdu");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String s1 = driver.findElement(By.xpath("//a[text()='Logout']")).getText();
		if (s1.equalsIgnoreCase("Logout")) {
			System.out.println("Login Succeful; Test PASS");
		} else {
			System.out.println("Invalid Credentials; Test FAIL");
		}
		
		//Scenario 7 - Verify the functionality of "Approve Time-Track Module"
		driver.findElement(By.xpath("//a[text()='Approve Time-Track']")).click();
		String s7 = driver.findElement(By.xpath("//td[text()='Approve Time-Track']")).getText();
		if (s7.contains("Approve")) {
			System.out.println("You are in Approve Time-Track Module; Test PASS");
		} else {
			System.out.println("You are not in Approve Time-Track Module; Test FAIL");
		}
		
		driver.quit();
	}

}
