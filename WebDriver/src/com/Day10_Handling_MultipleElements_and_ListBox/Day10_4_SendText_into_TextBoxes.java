package com.Day10_Handling_MultipleElements_and_ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_4_SendText_into_TextBoxes {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//To fill text boxes with "Selenium"
		driver.get("file:///E:/WebDriver/jars/html/Multiple_Elements.html");
		List<WebElement> textBox = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(textBox.size());
		for (WebElement type : textBox) {
			Thread.sleep(1000);
			type.sendKeys("Selenium");
		}
		driver.quit();
	}
}
