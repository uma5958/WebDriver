package com.Day8_TravelTrolley;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC8_fillform_FlightHotels {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.traveltrolley.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Flight + Hotel']")).click();
		driver.findElement(By.xpath("//input[@id='DestinationFrom']")).sendKeys("London");
		driver.findElement(By.xpath("//input[@id='DestinationTo']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		boolean check = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		if (check) {
			System.out.println("FormFilled Successfully; Test PASS");
		} else {
			System.out.println("Test FAIL");
		}
		driver.quit();
		}
}
