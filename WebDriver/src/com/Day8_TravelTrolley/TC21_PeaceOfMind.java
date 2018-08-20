package com.Day8_TravelTrolley;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC21_PeaceOfMind {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.traveltrolley.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement sd = driver.findElement(By.xpath("//a[contains(text(), 'ATOL / ABTA / IATA')]"));
        sd.sendKeys(Keys.PAGE_DOWN);
        sd.sendKeys(Keys.PAGE_DOWN);
        sd.sendKeys(Keys.PAGE_DOWN);    
		
        //ATOL / ABTA / IATA
        driver.findElement(By.xpath("//a[contains(text(), 'ATOL / ABTA / IATA')]")).click();
        driver.navigate().back();
        //Data Protection Policy 
        driver.findElement(By.xpath("//a[@href='/data-protection-policy/']")).click();
        driver.navigate().back();
        //Travel Protection
        driver.findElement(By.xpath("//a[@href='/travel-protection/']")).click();
        driver.navigate().back();
        //Become Affiliate
        driver.findElement(By.xpath("//a[@href='/affiliate/']")).click();
        driver.navigate().back();
		System.out.println("Peace Of Mind; Test PASS");
		driver.quit();
		}
}
