package com.Day2_To_Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_6_TroversingInXpath_DependentAndIndependents {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/WebDriver/jars/html/Traversing,%20Independent&Dependent_Table.html");
		
		//Teting & Fee
		String text1 = driver.findElement(By.xpath("//td[text()='Testing']")).getText();
		if (text1.contains("Testing")) {
			System.out.println(driver.findElement(By.xpath("//td[text()='Testing']/../td[3]")).getText());
		} else {
			System.out.println("Fee Needs to be Updated");
		}
		
		//Core Java & Fee
		String text2= driver.findElement(By.xpath("//td[text()='Core Java']")).getText();
		if (text2.contains("Core Java")) {
			System.out.println(driver.findElement(By.xpath("//td[text()='Core Java']/../td[3]")).getText());
		} else {
			System.out.println("Fee Needs to be Updated");
	   }
		
		driver.close();
	}
}
