package com.Day7_To_Day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day7_1_Wait_Statements {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/umaheswararao/login.do");
		//To give time out for All findElement ans findElements statements
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("umakvdu");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("AHasuTYR");
		driver.findElement(By.xpath("//div[contains(text(),'Login')][1]")).click();
		//To wait whereever we want to wait on specific condition 
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.titleContains("actiTIME"));
		System.out.println(driver.getTitle());
		wait.until(ExpectedConditions.urlContains("actitime"));
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}

}
