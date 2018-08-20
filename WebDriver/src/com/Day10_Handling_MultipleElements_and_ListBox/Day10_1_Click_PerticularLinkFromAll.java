package com.Day10_Handling_MultipleElements_and_ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_1_Click_PerticularLinkFromAll {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//To click on perticular link from all links
		driver.get("file:///E:/WebDriver/jars/html/Multiple_Elements.html");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println(allLinks.size());
		//WebElement ele1 = allLinks.get(0);
		//ele1.click();
		allLinks.get(0).click();
		//driver.quit();
	}
}
