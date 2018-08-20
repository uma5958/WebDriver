package com.Day8_TravelTrolley;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC7_Click_flightHotelLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.traveltrolley.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Flight + Hotel']")).click();
		String txt = driver.findElement(By.xpath("//span[text()='Flight + Hotel']")).getText();
		if (txt.contains("Flight + Hotel")) {
			System.out.println("You are in Flight + Hotel; Test PASS");
		} else {
			System.out.println("Test FAIL");
		}
		driver.quit();
		}
}
