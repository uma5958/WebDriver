package com.Day7_ActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S3_url {

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
		//Scenario 3 - Verify the Url
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.urlContains("actitime"));
		String s3 = driver.getCurrentUrl();
		if (s3.contains("https://online.actitime.com")) {
			System.out.println("Url Matched; Test PASS");
		} else {
			System.out.println("Url Not Matched; Test FAIL");
		}
		
		driver.quit();
	}

}
