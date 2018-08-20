package com.Day8_TravelTrolley;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC37_India_Delhi {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.traveltrolley.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    
	    driver.findElement(By.linkText("FLIGHTS")).click();
	    driver.findElement(By.linkText("Delhi")).click();
	    Thread.sleep(1000);
	    System.out.println("Fights to Delhi; Test PASS");
		driver.quit();
		}
}
