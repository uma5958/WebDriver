package com.Day8_TravelTrolley;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC26_TwitterLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.traveltrolley.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		/*WebElement sd = driver.findElement(By.xpath("//a[contains(text(), 'Contact Us')]"));
        sd.sendKeys(Keys.PAGE_DOWN);
        sd.sendKeys(Keys.PAGE_DOWN);
        sd.sendKeys(Keys.PAGE_DOWN);    
		*/
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 2000)");
        driver.findElement(By.xpath("//span[@class='tweets']")).click();
        //driver.navigate().back();
        
		System.out.println("Twitter Link; Test PASS");
		driver.quit();
		}
}
