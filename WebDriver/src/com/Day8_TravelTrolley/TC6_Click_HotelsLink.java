package com.Day8_TravelTrolley;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC6_Click_HotelsLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.traveltrolley.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Hotels']")).click();
		String txt = driver.findElement(By.xpath("//*[text()='Check In']")).getText();
		if (txt.contains("Check In")) {
			System.out.println("You are at Hotel Booking; Test PASS");
		} else {
			System.out.println("Test FAIL");
		}
		driver.quit();
		}
}
