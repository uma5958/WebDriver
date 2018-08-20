package com.Day8_TravelTrolley;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC24_PopularDestinations {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.traveltrolley.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//window scrolling using javascript executor interface
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 2000)");
        
        driver.findElement(By.xpath("//a[contains(text(), 'Flights to Far East')]")).click();
        driver.navigate().back();
        
        driver.findElement(By.xpath("//a[contains(text(), 'Flights to Indian Ocean')]")).click();
        driver.navigate().back();
        
        driver.findElement(By.xpath("//a[contains(text(), 'Flights to South America')]")).click();
        driver.navigate().back();
        
        driver.findElement(By.xpath("//a[contains(text(), 'Flights to Middle East')]")).click();
        driver.navigate().back();
		
        driver.findElement(By.xpath("//a[contains(text(), 'Flights to South Africa')]")).click();
        driver.navigate().back();
        
        driver.findElement(By.xpath("//a[contains(text(), 'Flights to East Africa')]")).click();
        driver.navigate().back();
        
        driver.findElement(By.xpath("//a[contains(text(), 'Flights to USA')]")).click();
        driver.navigate().back();
        
        driver.findElement(By.xpath("//a[contains(text(), 'Flights to Australia')]")).click();
        driver.navigate().back();
        
        driver.findElement(By.xpath("//a[contains(text(), 'Flights to New Zealand')]")).click();
        driver.navigate().back();
        
        driver.findElement(By.xpath("//a[contains(text(), 'Flights to India')]")).click();
        driver.navigate().back();
        
        driver.findElement(By.xpath("//a[contains(text(), 'Flights to Canada')]")).click();
        driver.navigate().back();
		System.out.println("Popular Destinations; Test PASS");
		driver.quit();
		}
}
