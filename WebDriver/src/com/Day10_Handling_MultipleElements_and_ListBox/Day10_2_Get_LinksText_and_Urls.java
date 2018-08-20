package com.Day10_Handling_MultipleElements_and_ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_2_Get_LinksText_and_Urls {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//To get all links text and their url's
		driver.get("file:///E:/WebDriver/jars/html/Multiple_Elements.html");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println(allLinks.size());
		//int count = allLinks.size();
		//using for loop
	/*	for(int i=0; i<count; i++) {
			System.out.println(allLinks.get(i).getText());
			String url = allLinks.get(i).getAttribute("href");
			System.out.println(url);
		}*/
		//using for-each loop
		for (WebElement link : allLinks) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
		driver.quit();
	}
}
