package com.Day8_TravelTrolley;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC15_MyBooking {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.traveltrolley.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("MY BOOKING")).click();
		String text = driver.findElement(By.xpath("//h2[text()='My Booking']")).getText();
		if (text.contains("My")) {
			System.out.println("You are in My Booking; Test PASS");
		} else {
			System.out.println("Test FAIL");
		}
		driver.quit();
		}
}
