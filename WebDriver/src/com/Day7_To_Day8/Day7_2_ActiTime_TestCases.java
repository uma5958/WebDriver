package com.Day7_To_Day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day7_2_ActiTime_TestCases {

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
		
		//Scenario 2 - Verify the Page Title
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.titleContains("actiTIME"));
		String s2 = driver.getTitle();
		if (s2.contains("actiTIME")) {
			System.out.println("Title Matched; Test PASS");
		} else {
			System.out.println("Title Not Matched; Test FAIL");
		}
		
		//Scenario 3 - Verify the Url
		wait.until(ExpectedConditions.urlContains("actitime"));
		String s3 = driver.getCurrentUrl();
		if (s3.contains("https://online.actitime.com")) {
			System.out.println("Url Matched; Test PASS");
		} else {
			System.out.println("Url Not Matched; Test FAIL");
		}
		
		//Scenario - Time Track Module
		//Scenario 4 - Verify the functionality of "Enter Time-Track Module"
		String s4 = driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		if (s4.equalsIgnoreCase("Enter Time-Track")) {
			System.out.println("You are in Enter Time-Track Module; Test PASS");
		} else {
			System.out.println("You are not in Enter Time-Track Module; Test FAIL");
		}
		
		//Scenario 5 - Verify the functionality of "View Time-Track Module"
		driver.findElement(By.xpath("//a[text()='View Time-Track']")).click();
		String s5 = driver.findElement(By.xpath("//div[text()='Time-Track Details']")).getText();
		if (s5.equalsIgnoreCase("Time-Track Details")) {
			System.out.println("You are in View Time-Track Module; Test PASS");
		} else {
			System.out.println("You are not in View Time-Track Module; Test FAIL");
		}
		
		//Scenario 6 - Verify the functionality of "Lock Time-Track Module"
		driver.findElement(By.xpath("//a[text()='Lock Time-Track']")).click();
		String s6 = driver.findElement(By.xpath("//span[text()='Lock Time-Track']")).getText();
		if (s6.equalsIgnoreCase("Lock Time-Track")) {
			System.out.println("You are in Lock Time-Track Module; Test PASS");
		} else {
			System.out.println("You are not in Lock Time-Track Module; Test FAIL");
		}
		
		//Scenario 7 - Verify the functionality of "Approve Time-Track Module"
		driver.findElement(By.xpath("//a[text()='Approve Time-Track']")).click();
		String s7 = driver.findElement(By.xpath("//td[text()='Approve Time-Track']")).getText();
		if (s7.contains("Approve")) {
			System.out.println("You are in Approve Time-Track Module; Test PASS");
		} else {
			System.out.println("You are not in Approve Time-Track Module; Test FAIL");
		}
		
		//Scenario 8 - Verify the functionality of "TASKS Module" 
		driver.findElement(By.xpath("//div[text()='TASKS']")).click();
		String s8 = driver.findElement(By.xpath("//div[text()='Customers & Projects']")).getText();
		if (s8.contains("Projects")) {
			System.out.println("You are in Tasks Module; Test PASS");
		} else {
			System.out.println("You are not in Taks Module; Test FAIL");
		}
		
		//Scenario 9 - Verify the functionality of "REPORTS Module" 
		driver.findElement(By.xpath("//div[text()='REPORTS']")).click();
		String s9 = driver.findElement(By.xpath("//td[text()='Reports Dashboard']")).getText();
		if (s9.contains("Reports")) {
				System.out.println("You are in Reports Module; Test PASS");
		} else {
				System.out.println("You are not in Reports Module; Test FAIL");
		}
		
		//Scenario 10 - Verify the functionality of "USERS Module"
		driver.findElement(By.xpath("//div[text()='USERS']")).click();
		String s10 = driver.findElement(By.xpath("//span[text()='User List']")).getText();
		if (s10.contains("User List")) {
				System.out.println("You are in Users Module; Test PASS");
		} else {
				System.out.println("You are not in Users Module; Test FAIL");
		}
		
		//Scenario 11 - Verify the Logout functionality 
		driver.findElement(By.xpath("//a[@id='logoutLink'] | //a[text()='Logout']")).click();
		wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
		String s11 = driver.getTitle();
		if (s11.contains("Login")) {
			System.out.println("Log out Successful; Test PASS");
		} else {
			System.out.println("Trouble in Logout");
		}
		
		driver.quit();
	}

}
