package com.Day8_TravelTrolley;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC10_fillForm_CarHire {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.traveltrolley.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Car hire']")).click();
		driver.findElement(By.xpath("//input[@id='txtto']")).sendKeys("Source");
		driver.findElement(By.xpath("//input[@id='txtfrom']")).sendKeys("Destination");
		System.out.println("CarHire form filled Succesfully; Test PASS");
		driver.quit();
		}
}
