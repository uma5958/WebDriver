package com.Day10_Handling_MultipleElements_and_ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_3_Check_or_UnCheck_CheckBoxes {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//To check & uncheck all check boxes
		driver.get("file:///E:/WebDriver/jars/html/Multiple_Elements.html");
		List<WebElement> check = driver.findElements(By.xpath("//input"));
		System.out.println(check.size());
		for (WebElement cb : check) {
			cb.click();
			Thread.sleep(1000);
		}
		driver.quit();
	}
}
