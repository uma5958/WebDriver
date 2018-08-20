package com.Day7_To_Day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_4_BACK_SPACE {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("file:///E:/WebDriver/jars/html/TextBox.html");
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='a1']"));
		String val = ele1.getAttribute("value");
		int count = val.length();
		for(int i=1; i<count; i++) {
			ele1.sendKeys(Keys.BACK_SPACE);
		}
		driver.quit();
	}

}
