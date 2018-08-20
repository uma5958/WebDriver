package com.Day8_TravelTrolley;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC16_ListYourPropertyWithUs {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.traveltrolley.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		/*
		//Page scrolling using KeyBoard Operations
		By scroll = By.xpath("//a[contains(text(), 'Contact')]");
		WebElement sd = driver.findElement(scroll);
		*/
        WebElement sd = driver.findElement(By.xpath("//a[contains(text(), 'List your property')]"));
        sd.sendKeys(Keys.PAGE_DOWN);
        sd.sendKeys(Keys.PAGE_DOWN);
        sd.sendKeys(Keys.PAGE_DOWN);    
		  
		driver.findElement(By.xpath("//a[contains(text(), 'List your property')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='PropertyName']")).sendKeys("India");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='NoOfRooms']")).sendKeys("1");
		Thread.sleep(2000);
		System.out.println("List your property form Filled; Test PASS");
		driver.quit();
		}
}
