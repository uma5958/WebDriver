package com.Day7_To_Day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_10_isSelected_click_checkBoxAndRadio {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("file:///E:/Oxygen/jars/html/CheckBox.html");
		
		boolean cb1 = driver.findElement(By.xpath("//input[@id='a1']")).isSelected();
		if (cb1) {
			System.out.println("CB1 Selected");
		} else {
			System.out.println("CB1 Not Selected");
		}
		boolean cb2 = driver.findElement(By.xpath("//input[@id='a2']")).isSelected();
		if (cb2) {
			System.out.println("CB2 Selected");
		} else {
			System.out.println("CB2 Not Selected");
		}
		
		driver.quit();
	}

}
