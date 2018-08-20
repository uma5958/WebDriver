package com.Day7_To_Day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_1_get_Methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("file:///E:/WebDriver/jars/html/TextBox.html");
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='a1']"));
		System.out.println(ele1.getAttribute("value"));
		System.out.println(ele1.getAttribute("id"));
		System.out.println(ele1.getTagName());
		driver.quit();
	}

}
