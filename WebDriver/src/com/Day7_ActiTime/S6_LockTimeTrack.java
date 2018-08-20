package com.Day7_ActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S6_LockTimeTrack {

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
		
		//Scenario 6 - Verify the functionality of "Lock Time-Track Module"
		driver.findElement(By.xpath("//a[text()='Lock Time-Track']")).click();
		String s6 = driver.findElement(By.xpath("//span[text()='Lock Time-Track']")).getText();
		if (s6.equalsIgnoreCase("Lock Time-Track")) {
			System.out.println("You are in Lock Time-Track Module; Test PASS");
		} else {
			System.out.println("You are not in Lock Time-Track Module; Test FAIL");
		}
		driver.quit();
	}

}
