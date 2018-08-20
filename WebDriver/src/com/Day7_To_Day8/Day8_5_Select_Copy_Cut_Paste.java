package com.Day7_To_Day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_5_Select_Copy_Cut_Paste {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("file:///E:/WebDriver/jars/html/TextBox.html");
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='a1']"));
		ele1.sendKeys(Keys.CONTROL+"a"); //select
		Thread.sleep(2000);
		ele1.sendKeys(Keys.CONTROL+"c"); //copy
		//ele1.sendKeys(Keys.CONTROL+"x"); //cut
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='a2']"));
		ele2.sendKeys(Keys.CONTROL+"v"); //paste
		Thread.sleep(2000);
		driver.quit();
	}

}
