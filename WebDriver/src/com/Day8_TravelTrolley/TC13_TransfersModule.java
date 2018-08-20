package com.Day8_TravelTrolley;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC13_TransfersModule {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.traveltrolley.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Transfers']")).click();
		driver.findElement(By.xpath("//input[@id='txtDeparturePointCode']")).sendKeys("London");
		driver.findElement(By.xpath("//input[@id='txtArrivalPointCode']")).sendKeys("Bangalore");
		boolean form = driver.findElement(By.xpath("//input[@id='rbd1_1']")).isSelected();
		if (form) {
			System.out.println("Form filled; Test PASS");
		} else {
			System.out.println("Test FAIL");
		}
		driver.quit();
		}
}
