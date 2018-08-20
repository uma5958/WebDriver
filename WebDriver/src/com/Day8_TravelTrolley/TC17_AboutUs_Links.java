package com.Day8_TravelTrolley;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC17_AboutUs_Links {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.traveltrolley.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement sd = driver.findElement(By.xpath("//a[contains(text(), 'Contact')]"));
        sd.sendKeys(Keys.PAGE_DOWN);
        sd.sendKeys(Keys.PAGE_DOWN);
        sd.sendKeys(Keys.PAGE_DOWN);    
		 
        //About us
        driver.findElement(By.xpath("//a[@href='/about-us/']")).click();
        driver.navigate().back();
        //Contact us
		driver.findElement(By.xpath("//a[contains(text(), 'Contact')]")).click();
		driver.navigate().back();
		//Reviews
		driver.findElement(By.xpath("//a[@href='/reviews/']")).click();
		driver.navigate().back();
		//Terms & conditions
		driver.findElement(By.xpath("//a[@href='/terms-conditions/']")).click();
		driver.navigate().back();
		
		System.out.println("All Links under About us Module Are working; Test PASS");
		driver.quit();
		}
}
