package com.Day8_TravelTrolley;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC9_click_carhire {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.traveltrolley.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Car hire']")).click();
		String txt = driver.findElement(By.xpath("//*[text()='Pick Up']")).getText();
		if (txt.contains("Pick Up")) {
			System.out.println("You are in car hire module; Test PASS");
		} else {
			System.out.println("Test FAIL");
		}
		driver.quit();
		}
}
