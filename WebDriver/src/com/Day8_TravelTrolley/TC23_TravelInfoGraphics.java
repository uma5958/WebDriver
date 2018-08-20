package com.Day8_TravelTrolley;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC23_TravelInfoGraphics {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.traveltrolley.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement sd = driver.findElement(By.xpath("//a[@href='/travel-infographics/']"));
        sd.sendKeys(Keys.PAGE_DOWN);
        sd.sendKeys(Keys.PAGE_DOWN);
        sd.sendKeys(Keys.PAGE_DOWN);    
		
        driver.findElement(By.xpath("//a[@href='/travel-infographics/']")).click();
		driver.navigate().back();
		System.out.println("Travel Infographics; Test PASS");
		driver.quit();
		}
}
