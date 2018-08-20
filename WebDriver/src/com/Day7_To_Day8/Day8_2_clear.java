package com.Day7_To_Day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_2_clear {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("file:///E:/WebDriver/jars/html/TextBox.html");
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='a1']"));
		Thread.sleep(3000);
		ele1.clear();
		Thread.sleep(3000);
		driver.quit();
	}

}
