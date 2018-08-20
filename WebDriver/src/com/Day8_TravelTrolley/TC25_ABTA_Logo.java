package com.Day8_TravelTrolley;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC25_ABTA_Logo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.traveltrolley.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement sd = driver.findElement(By.xpath("//a[contains(text(), 'Contact Us')]"));
        sd.sendKeys(Keys.PAGE_DOWN);
        sd.sendKeys(Keys.PAGE_DOWN);
        sd.sendKeys(Keys.PAGE_DOWN);    
		
        driver.findElement(By.xpath("//img[@alt='ABTA']")).click();
        driver.navigate().back();
        
		System.out.println("ABTA website; Test PASS");
		driver.quit();
		}
}
