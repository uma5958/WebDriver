package com.Day8_TravelTrolley;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_Click_OneWayRadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.traveltrolley.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='OneWay']")).click();
		boolean e = driver.findElement(By.xpath("//input[@id='OneWay']")).isSelected();
		if (e) {
			System.out.println("Radio clicked; Test PASS");
		} else {
			System.out.println("Radio Not clicked; Test FAIL");
		}
		driver.quit();
		}
}
