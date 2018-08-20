package com.Day2_To_Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_1_Chrome {
	public static void main(String[] args) throws InterruptedException {
		{	
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			/*driver.get("https://alpha.valuechain.com/Login");
			driver.findElement(By.cssSelector("input#txtLoginName")).sendKeys("vrdemo@valuechain.com");
			driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Mangalore22");
			driver.findElement(By.id("btnLogin")).click();*/
			
			driver.get("http://www.seleniumhq.org");
			driver.manage().window().maximize();
			driver.navigate().to("http://www.seleniumhq.org/download/");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			driver.quit();
		}
	}
}
