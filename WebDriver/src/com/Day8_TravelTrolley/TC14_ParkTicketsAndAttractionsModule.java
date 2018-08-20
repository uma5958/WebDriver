package com.Day8_TravelTrolley;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC14_ParkTicketsAndAttractionsModule {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.traveltrolley.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Holiday Extra']")).click();
		driver.findElement(By.linkText("Park Tickets & Attractions")).click();
		String txt = driver.findElement(By.xpath("//*[contains(text(), 'Top Sellers')]")).getText();
		if (txt.contains("Top Sellers")) {
			System.out.println("You are in Park Tickets & Attractions Module; Test PASS");
		} else {
			System.out.println("Test FAIL");
		}
		driver.quit();
		}
}
