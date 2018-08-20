package com.Day10_Handling_MultipleElements_and_ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_5_Get_AllTextFromTable {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//To get All text in a Table
		driver.get("file:///E:/WebDriver/jars/html/Multiple_Elements.html");
		List<WebElement> ele = driver.findElements(By.xpath("//td"));
		System.out.println(ele.size());
		for (WebElement text : ele) {
				System.out.println(text.getText());
		}
		driver.quit();
	}
}
